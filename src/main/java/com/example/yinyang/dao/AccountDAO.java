package com.example.yinyang.dao;

import com.example.yinyang.DO.Account;
import com.example.yinyang.DO.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * AccountDAO继承基类
 */
@Repository
public interface AccountDAO extends MyBatisBaseDao<Account, Integer, AccountExample> {
}