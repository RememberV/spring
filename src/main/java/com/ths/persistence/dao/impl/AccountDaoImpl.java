package com.ths.persistence.dao.impl;

import com.ths.persistence.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author JiangYu
 * @Description 账户Dao实现
 * @Date 2022-08-23 13:05
 * @Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Override
    public boolean take(String id, BigDecimal count) {
        String sql = "update account set balance = balance - ? where id = ?";
        return jdbcTemplate.update(sql, count, id) > 0;
    }


    @Override
    public boolean save(String id, BigDecimal count) {
        String sql = "update account set balance = balance + ? where id = ?";
        return jdbcTemplate.update(sql, count, id) > 0;
    }
}

