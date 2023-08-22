package com.xianyu.repository;

import com.xianyu.entity.system.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    /**
     * 通过账号查找
     */
    Optional<User> findByAccount(String account);

}
