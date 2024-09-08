package com.spring.unity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUnity {
    static  private Reader reader=null;
    static  private SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
            reader = Resources.getResourceAsReader("config/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
