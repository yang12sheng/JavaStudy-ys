package com.ychs.controller.mybatisday03.src.com.ychs.service;

import com.ychs.bean.User;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public interface UserService {
    public List<User> getUsers() throws IOException;

    public User getUserById(int id) throws IOException;

    public int deleteUserById(int id) throws IOException;
    public int editUser(User user) throws IOException;

    public List<User> getUsersByCondition(HashMap map) throws IOException;

    public int addUser(User user) throws IOException;
}
