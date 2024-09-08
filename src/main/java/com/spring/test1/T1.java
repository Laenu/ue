package com.spring.test1;

import com.spring.dao.impl.UserListImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T1 {
    @Test
    public void con(){
//        测试是否能够正常写入
        UserListImpl userList=new UserListImpl();
        List<String> strings=new ArrayList<>();
        strings.add("123");
        strings.add("23333");
        userList.setStringName(strings);
        userList.showList();
    }
    @Test
    public void t2(){
        UserListImpl userList=new UserListImpl();
       Map<String,String> stringMap=new HashMap<>();
       stringMap.put("user","1234");
       stringMap.put("user2","12345");
        for (Map.Entry<String,String> entry: stringMap.entrySet()
             ) {
            System.out.println(entry);
        }
    }

}
