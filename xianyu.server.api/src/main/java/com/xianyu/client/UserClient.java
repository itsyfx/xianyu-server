package com.xianyu.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("xianyu-server")
public interface UserClient {
    
    @GetMapping("/login")
    void login();

    @GetMapping("/logout")
    void logout();

}
