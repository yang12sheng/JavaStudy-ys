package com.ychs.service.impl;

import com.ychs.bean.User;
import com.ychs.dao.UserDao;
import com.ychs.dao.impl.UserDaoImpl;
import com.ychs.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public boolean addUser(User user) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int res = dao.addUser(user);
        return res>0?true:false;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        UserDao dao = new UserDaoImpl();
        return dao.getUsersByCondition(null);
    }
}
