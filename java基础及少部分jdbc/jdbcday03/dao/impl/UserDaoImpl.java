package com.ychs.dao.impl;

import com.ychs.bean.User;
import com.ychs.dao.UserDao;
import com.ychs.util.DBUtil6;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(User user) throws SQLException {
        //1、创建 QueryRunner 对象
        QueryRunner qr = new QueryRunner(DBUtil6.getDataSource());
        //2、编写sql语句
        String sql = "insert into t_user values(?,?,?)";
        //3、执行
        int res = qr.update(sql, new Object[]{user.getUsername(),user.getPassword(),user.getPassword()});
        return res;
    }

    @Override
    public List<User> getUsersByCondition(User user) throws SQLException {
        //1、创建 QueryRunner 对象
        QueryRunner qr = new QueryRunner(DBUtil6.getDataSource());
        String sql = "select * from t_user";
        List<User> users = qr.query(sql, new BeanListHandler<User>(User.class));
        return users;
    }
}
