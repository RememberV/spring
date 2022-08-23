package com.ths.persistence.dao;

import java.math.BigDecimal;

/**
 * @Author JiangYu
 * @Description 账户Dao
 * @Date 2022-08-23 13:03
 * @Version 1.0
 */
public interface AccountDao {
    boolean take(String id, BigDecimal count);

    boolean save(String id, BigDecimal count);


}
