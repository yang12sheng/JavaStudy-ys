package com.ychs.service.impl;

import com.ychs.bean.Major;
import com.ychs.bean.ResultBean;
import com.ychs.mapper.MajorMapper;
import com.ychs.service.MajorService;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class MajorServiceImpl implements MajorService {
    @Override
    public ResultBean<Major> getMajorsByCondition(Major major) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MajorMapper mapper = sqlSession.getMapper(MajorMapper.class);
        List<Major> list = mapper.getMajorsByCondition(major);
        Integer count = mapper.getCountByCondition(major);
        ResultBean<Major> rb = new ResultBean<>();
        rb.setCode("0");
        rb.setMsg("");
        rb.setCount(count);
        rb.setData(list);
        sqlSession.close();
        return rb;
    }

    @Override
    public int addMajor(Major major) {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        MajorMapper mapper = sqlSession.getMapper(MajorMapper.class);
        int res = mapper.addMajor(major);
        sqlSession.commit();
        sqlSession.close();
        return res;
    }
}
