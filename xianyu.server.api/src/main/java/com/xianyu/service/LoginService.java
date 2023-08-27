package com.xianyu.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("xianyu-server")
public interface LoginService {

    @GetMapping("/login")
    void login();

    @GetMapping("/logout")
    void logout();

}
