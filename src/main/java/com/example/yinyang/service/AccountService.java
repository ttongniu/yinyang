package com.example.yinyang.service;

import com.example.yinyang.DO.Account;
import com.example.yinyang.DO.AccountExample;
import com.example.yinyang.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

   @Autowired(required = true)
   private AccountDAO accountDAO;


  public List<Account> findAll() {
     AccountExample example   =   new AccountExample();
     return accountDAO.selectByExample(example);
  }
}
