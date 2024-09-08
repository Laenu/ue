package com.spring.dao.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

public class UserDaoImpl implements UserDao {

    UserService userService;
    public String name;
    public UserDaoImpl(){
    }
    public UserDaoImpl(String name){
        this.name=name;
    }
    public void setUserService(UserService userService) {
        System.out.println("sd");
        this.userService=userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("recode");
        this.name = name;
    }
}
