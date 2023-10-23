package com.ychs.test;

import com.ychs.bean.Clazz;
import com.ychs.bean.Student;
import com.ychs.mapper.ClazzMapper;
import com.ychs.mapper.StudentMapper;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.List;


public class TestClazz {
    private static Logger logger = Logger.getLogger(TestClazz.class);
    @Test
   public void getClazzes(){

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        List<Clazz> clazzes =mapper.getClazzes();

        logger.debug(clazzes);
        sqlSession.close();
   }
   @Test
   public void getClazzById(){

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        // mybatis一级 缓冲  作用域 是 同一个 sqlSession
        Clazz c1 = mapper.getClazzById(10);
        System.out.println(c1);
        sqlSession.close();
        //添加操作
        //执行完增删改的时候  默认把缓冲中的东西全部清理

        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        ClazzMapper mapper2 = sqlSession2.getMapper(ClazzMapper.class);
        Clazz c2 = mapper2.getClazzById(10);
        System.out.println(c2);
        sqlSession2.close();
   }
   @Test
   public void getClazz() {

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ClazzMapper mapper = sqlSession.getMapper(ClazzMapper.class);
        List<Clazz> clazzes = mapper.getClazz();
        for (Clazz clazz : clazzes) {
           //logger.debug(clazz.getCno()+","+clazz.getCname());}

        }
        sqlSession.close();
   }



}
