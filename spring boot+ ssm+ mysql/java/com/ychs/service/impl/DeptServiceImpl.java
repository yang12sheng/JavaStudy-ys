package com.ychs.service.impl;

import com.ychs.bean.Dept;
import com.ychs.mapper.DeptMapper;
import com.ychs.service.DeptService;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class DeptServiceImpl implements DeptService {
    @Override
    public List<Dept> getDepts() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        List<Dept> list = mapper.getDepts();
        sqlSession.close();
        return list;
    }
}
