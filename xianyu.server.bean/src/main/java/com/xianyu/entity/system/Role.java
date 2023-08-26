package com.xianyu.entity.system;

import com.xianyu.entity.base.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "XIANYU_SYSTEM_ROLE")
public class Role extends AbstractEntity{

    private String code;

    private String name;
    
}
