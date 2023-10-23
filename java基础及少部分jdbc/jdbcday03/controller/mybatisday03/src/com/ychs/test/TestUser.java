package com.ychs.controller.mybatisday03.src.com.ychs.test;

import com.ychs.bean.User;
import com.ychs.service.UserService;
import com.ychs.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class TestUser {
    private static Logger logger = Logger.getLogger(TestUser.class);
    @Test
    public void getUsers() throws IOException {
        //多态
        UserService us = new UserServiceImpl();
        List<User> users = us.getUsers();
        logger.debug(users);
        logger.info(users);
//        System.out.println(users);
    }
    @Test
    public void getUserByUserId() throws IOException {
        //多态
        UserService us = new UserServiceImpl();
        User user = us.getUserById(1);
//        System.out.println(user);
        logger.debug(user);
    }

    @Test
    public void deleteUserById() throws IOException {
        UserService us = new UserServiceImpl();
        int res = us.deleteUserById(5);
        System.out.println(res);

    }
    @Test
    public void editUser() throws IOException {
        UserService us = new UserServiceImpl();
        User user = new User();
        /*user.setId(2);
        user.setUsername("admin123");
        user.setPassword("admin1");*/
        int res = us.editUser(user);
        System.out.println(res);

    }

    @Test
    public void getUsersByCondition() throws IOException {
        UserService us = new UserServiceImpl();
        HashMap map = new HashMap();//key value
        map.put("tab","t_user");
        map.put("aaa","a");
        map.put("id","id");
        map.put("px","desc");
        map.put("page",1);
        map.put("pageSize",2);
        List<User> users = us.getUsersByCondition(map);
        logger.debug(users);
    }
    @Test
    public void addUser() throws IOException {
        UserService us = new UserServiceImpl();
        User user = new User();
        user.setUsername("admin456");
        user.setPassword("admin4");
        int res = us.addUser(user);
        logger.debug(user);
    }
}
