package com.ychs.service;

import com.ychs.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public boolean addUser(User user) throws SQLException;
    public List<User> getUsers() throws SQLException;
}
