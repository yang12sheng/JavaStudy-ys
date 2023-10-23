package com.ychs.service;

import com.ychs.bean.Clazz;
import com.ychs.bean.Student;
import com.ychs.mapper.StudentMapper;
import com.ychs.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStudent2 {
    private static Logger logger = Logger.getLogger(TestStudent.class);
    @Test
    public void batchQuery(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //数组中有默认的值             定义数组 三种方法
        //String[] snos =new String[3]
        //String[] snos =new String[]{1,2,3};
        // String[] snos ={"1001","1003"};
        //一个 int 类型数组  能不能存放其他类型  怎么存放        反射 泛型擦除

       // String[] snos ={"1001","1003"};
        List snos =new ArrayList();
        snos.add("1001");
        snos.add("1002");

        Map map = new HashMap();
        map.put("m",snos);
        List <Student> stus = mapper.batchQuery(map);
        sqlSession.commit();
        sqlSession.close();

    }@Test
    public void editStu(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student stu = new Student();
        //stu.setSname("张四");
       // stu.setSno("1001");
        int res = mapper.editStu(stu);
        logger.debug(res);
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void getStudents2(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Map map = new HashMap();
        map.put("cname","1");
        List<Student> list = mapper.getStudents2(map);
        logger.debug(list);
        sqlSession.close();

    }

    @Test
    public void getStudents(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        Student stu = new Student();
       // stu.setSname("三");
        Clazz clazz = new Clazz();
        //clazz.setCname("1");
       // stu.setClazz(clazz);

        List<Student> list = mapper.getStudents(stu);
        logger.debug(list);
        sqlSession.close();

    }
}
