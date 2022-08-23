package com.ths.service;

import java.math.BigDecimal;

/**
 * @Author JiangYu
 * @Description 用户服务
 * @Date 2022-08-21 10:44
 * @Version 1.0
 */
public interface UserService {
    /**
     * @methodName transfer
     * @description 用户转账操作
     * @author JiangYu
     * @time 2022-08-23 13:10
     * @param fromId: 转出账户id
     * @param toId: 转入帐户id
     * @param count: 转账金额
     * @return boolean
     */
    boolean transfer (String fromId, String toId, BigDecimal count);
}
