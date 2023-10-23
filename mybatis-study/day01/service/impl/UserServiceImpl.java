package com.ychs.service.impl;

import com.ychs.bean.User;
import com.ychs.mapper.UserMapper;
import com.ychs.service.UserService;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() throws IOException {

        /*String resource="SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);*/
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//        通过 sqlSessionFactory 创建sqlSession 对象
        //打开会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        通过sqlSession 生成代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        sqlSession.close();
        return users;
    }

    @Override
    public User getUserById(int id) throws IOException {
        String r = "SqlMapConfig.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream(r));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        Class ：表示运行时期的类
//        获取类对象    类名.class   对象名.getClass()  Class.forName(包名+类型);
        User user = userMapper.getUserById(id);
        sqlSession.close();
        return user;
    }

    @Override
    public int deleteUserById(int id) throws IOException {
        String r = "SqlMapConfig.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream(r));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.deleteUserById(id);
        //手动提交
        sqlSession.commit();
        sqlSession.close();
        return res;
    }

    @Override
    public int editUser(User user) throws IOException {
        String r = "SqlMapConfig.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream(r));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.editUser(user);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }

    @Override
    public List<User> getUsersByCondition(HashMap map) throws IOException {
        String r = "SqlMapConfig.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream(r));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.getUsersByCondition(map);
        sqlSession.close();
        return users;
    }

    @Override
    public int addUser(User user) throws IOException {
        String r = "SqlMapConfig.xml";
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsStream(r));
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }
}
