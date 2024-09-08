package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;

public class UserServiceImpl implements UserService {
    @Nullable
    private UserDao userDao;
    private String str;
    public UserServiceImpl(UserDao userDao) {
        System.out.println("sds");
        this.userDao = userDao;
    }
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {

        this.userDao = userDao;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        System.out.println(this.str+"/"+str);
        this.str = str;
    }
}
