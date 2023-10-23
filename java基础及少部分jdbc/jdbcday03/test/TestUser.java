package com.ychs.test;

import com.ychs.bean.User;
import com.ychs.service.UserService;
import com.ychs.service.impl.UserServiceImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class TestUser {
    @Test
    public void addUser() throws SQLException {
        UserService us = new UserServiceImpl();
        User user = new User();
        user.setUsername("zzz");
        user.setPassword("zzzzzz");
        user.setRealname("张三");
        boolean res = us.addUser(user);
        if(res){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
    @Test
    public void getUsers() throws SQLException {
        UserService us = new UserServiceImpl();
        List<User> users = us.getUsers();
        System.out.println(users);
    }
}
