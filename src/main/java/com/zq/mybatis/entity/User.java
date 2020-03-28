package com.zq.mybatis.entity;


import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String lastName;
    private String password;
    private boolean sex;



}
