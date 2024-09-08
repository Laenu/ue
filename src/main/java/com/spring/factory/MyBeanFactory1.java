package com.spring.factory;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {
    //静态工厂
    public static UserDao userDao(String username){
        System.out.println(username);
        return new UserDaoImpl(username);

    }


}
