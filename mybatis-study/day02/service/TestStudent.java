package com.ychs.service;

import com.ychs.bean.Clazz;
import com.ychs.bean.Student;
import com.ychs.mapper.StudentMapper;
import com.ychs.util.SqlSessionFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestStudent {
//    private static Logger logger = Logger.getLogger(TestStudent.class);
//    @Test
//    public void getCountByCid(){
//        //通过读取SqlMapConfig.xml 文件来 创建 sqlSessionFactory 对象
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //生成代理对象
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        int count = mapper.getCountByCid(2);
//        logger.debug("count:"+count);
//    }
//
//    @Test
//    public void getStudents(){
//        //通过读取SqlMapConfig.xml 文件来 创建 sqlSessionFactory 对象
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //生成代理对象
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//
//        Student student = new Student();
//        student.setSname("三");
//        List<Student> students = mapper.getStudents(student);
//        sqlSession.close();
//        logger.debug(students);
//    }
//
//    @Test
//    public void getStusByNameAndCname(){
//        //通过读取SqlMapConfig.xml 文件来 创建 sqlSessionFactory 对象
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //生成代理对象
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//
//        Student student = new Student();
//        student.setSname("三");
//        Clazz clazz = new Clazz();
//        clazz.setCname("1");
//        student.setClazz(clazz);
//
//        List<Student> stus = mapper.getStusByNameAndCname(student);
//        sqlSession.close();
//        logger.debug(stus);
//    }
//
//    @Test
//    public void f1(){
//        //通过读取SqlMapConfig.xml 文件来 创建 sqlSessionFactory 对象
//        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //生成代理对象
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//
//        Map map = new HashMap<>();
//        map.put("sno","1001");
//        HashMap m = mapper.getStuBySno(map);
//        sqlSession.close();
//        logger.debug(m);
//    }
}
