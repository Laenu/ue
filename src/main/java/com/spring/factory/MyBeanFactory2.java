package com.spring.factory;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;

public class MyBeanFactory2 {
    public  UserDao userDao(String name){
        return new UserDaoImpl( name);
    }


}
