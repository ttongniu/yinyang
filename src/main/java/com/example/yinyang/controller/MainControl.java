package com.example.yinyang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author niutongtong
 */
@Controller
public class MainControl {
  @RequestMapping("/index")
  public  String  getIndex(){
    return "index";
  }

  @RequestMapping("/welcome")
  public  String  getWelcome(){
    return "welcome";
  }

  @RequestMapping("/login")
  public  String  getLogin(){
    return "login";
  }
}
