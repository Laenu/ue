package com.spring.dao.impl;

import com.spring.dao.UserList;

import java.util.List;
import java.util.Map;

public class UserListImpl implements UserList {
    private List<String> stringName;
    private Map<String, String> stringMap;

    public void setStringName(List<String> stringName) {
        this.stringName = stringName;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public void showList() {
        for (String list : stringName) {
            System.out.println(list);
        }
    }
    public void showMap(){
        for (Map.Entry<String, String> entrySet:stringMap.entrySet()){
            System.out.println(entrySet);
        }
    }
}
