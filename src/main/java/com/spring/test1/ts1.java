package com.spring.test1;

import com.spring.dao.impl.UserDaoImpl;
import com.spring.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ts1 {
    @Test
    public void ts1() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("bean/beans1.xml");
        UserDaoImpl userDao = (UserDaoImpl) beanFactory.getBean("userDao");
        System.out.println(userDao);

    }

    @Test
    public void ts2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beans1.xml");
        UserServiceImpl userDao1 = (UserServiceImpl) context.getBean("userService");
        System.out.println(userDao1.getStr());
        System.out.println(userDao1);
        context.close();

    }

    @Test
    public void ts3() {
        //通过静态工厂的方法去创建bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beans2.xml");
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("user");
        System.out.println(userDao);

    }

    @Test
    public void ts4() {
        //实例工厂实例化bean
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beans2.xml");
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("en");
        System.out.println(userDao);

    }

    @Test
    public void ts5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beans3.xml");
        UserDaoImpl userDao = (UserDaoImpl) context.getBean("en");
        System.out.println(userDao);
    }

    @Test
    public void ts6() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/beans3.xml");
        UserDaoImpl userDao =(UserDaoImpl) context.getBean("userDao3");
        System.out.println(userDao);

    }
}

