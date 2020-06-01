package com.example.yinyang.controller;

import com.example.yinyang.DO.Account;
import com.example.yinyang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

  @Autowired
  AccountService accountService;

  @RequestMapping("/list")
  @ResponseBody
  public List<Account> list() {

    return accountService.findAll();
  }






}
