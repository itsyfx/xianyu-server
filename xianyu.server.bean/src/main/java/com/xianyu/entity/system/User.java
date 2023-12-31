package com.xianyu.entity.system;

import com.xianyu.entity.base.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "XIANYU_SYSTEM_USER")
public class User extends AbstractEntity {

    private String username;

    private String password;

    //@OneToMany
    //private Set<Role> roles = new HashSet<Role>();

    @Column(unique = true)
    private String account;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String mail;

    @Column(name = "update_password_time")
    private Date updatePasswordTime;

}
