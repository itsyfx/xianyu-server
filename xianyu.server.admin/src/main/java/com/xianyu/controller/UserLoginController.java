package com.xianyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xianyu.service.UserLoginService;

@RestController
public class UserLoginController {


    @Autowired
    private UserLoginService userLoginService;

    @GetMapping("/login")
    public void login(){
        userLoginService.login();
    }


}