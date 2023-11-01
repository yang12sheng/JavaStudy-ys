package com.ychs.service.impl;

import com.ychs.bean.User;
import com.ychs.mapper.UserMapper;
import com.ychs.service.UserService;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserServiceImpl implements UserService {
    @Override
    public User login(String username, String password) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.login(username,password);
        sqlSession.close();
        return user;
    }
}
