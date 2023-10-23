package com.ychs.test;

import com.ychs.bean.Clazz;
import com.ychs.bean.Student;
import com.ychs.mapper.StudentMapper;
import com.ychs.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestStudent {
  private static Logger logger = Logger.getLogger(TestStudent.class);
    @Test
   public void getStudent(){

       SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
      SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list =mapper.getStudents();

        logger.debug(list);
        sqlSession.close();
   }
}
