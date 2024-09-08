package com.spring;

import com.spring.pojo.User;
import com.spring.unity.MybatisUnity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;


public class db {
    private static SqlSessionFactory sqlSessionFactory = null;

    @Test
    public void ts1() {
//        Reader reader=null;
//        try {
//            reader = Resources.getResourceAsReader("config/mybatis-config.xml");
//
//            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session=sqlSessionFactory.openSession();
//
//           List<User> list= session.selectList("selectAllWebsite");
//            for (User ls: list
//                 ) {
//                System.out.println(ls);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //通过SqlSessionFactoryBuilder的build方法创建sqlSessionFactory
        MybatisUnity mybatisUnity = new MybatisUnity();
        SqlSession sqlSession = mybatisUnity.getSqlSession();
        List<User> list = sqlSession.selectList("selectAllWebsite");
        for (User ls : list) {
            System.out.println(ls);
        }
    }
}
