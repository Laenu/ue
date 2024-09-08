package com.spring.factory;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory3 implements FactoryBean<UserDao> {

    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
