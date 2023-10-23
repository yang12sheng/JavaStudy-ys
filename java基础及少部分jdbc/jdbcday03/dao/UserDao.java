package com.ychs.dao;

import com.ychs.bean.User;

import java.sql.SQLException;
import java.util.List;

/**
 * 持久层：和数据库进行交互的层面
 * 接口：常量，抽象方法，默认方法，静态方法
 * 定义规矩的
 */
public interface UserDao {
    public int addUser(User user) throws SQLException;
    public List<User> getUsersByCondition(User user) throws SQLException;
}
