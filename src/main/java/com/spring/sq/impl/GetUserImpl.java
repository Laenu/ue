package com.spring.sq.impl;

import com.spring.pojo.User;
import com.spring.sq.GetUser;
import com.spring.unity.MybatisUnity;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GetUserImpl implements GetUser {
    private List<User> listUser;

    @Override
    public List<User> GetUser() {
        MybatisUnity mybatisUnity = new MybatisUnity();
        SqlSession sqlSession = mybatisUnity.getSqlSession();
        listUser = sqlSession.selectList("selectAllWebsite");
        if (listUser.isEmpty()) {
            return null;
        } else {
            return listUser;
        }


    }
}
