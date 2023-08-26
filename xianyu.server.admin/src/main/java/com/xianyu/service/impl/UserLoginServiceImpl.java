package com.xianyu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xianyu.entity.system.User;
import com.xianyu.repository.UserRepository;
import com.xianyu.service.UserLoginService;

@Component
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void login() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Unimplemented method 'logout'");
    }
    
}
