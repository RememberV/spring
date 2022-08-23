package com.ths.service.impl;

import com.ths.persistence.dao.AccountDao;
import com.ths.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author JiangYu
 * @Description 用户服务操作
 * @Date 2022-08-21 10:46
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    AccountDao accountDao;

    /**
     * @param fromId : 转出账户id
     * @param toId   : 转入帐户id
     * @param count  : 转账金额
     * @return boolean
     * @methodName transfer
     * @description 用户转账操作
     * @author JiangYu
     * @time 2022-08-23 13:10
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 10)
    public boolean transfer(String fromId, String toId, BigDecimal count) {

        boolean take = accountDao.take(fromId, count);
//        int i = 10 / 0;
        boolean save = accountDao.save(toId, count);
        return take && save;
    }
}
