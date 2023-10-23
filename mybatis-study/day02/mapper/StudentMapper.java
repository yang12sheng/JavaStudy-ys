package com.ychs.mapper;

import com.ychs.bean.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
    public int getCountByCid(int cid);

    public List<Student> getStudents(Student student);
    public List<Student> getStudents2(Map map);

    public List<Student> getStusByNameAndCname(Student student);

    public HashMap getStuBySno(Map map);

    public int editStu(Student student);
    //批量查询
   // public List<Student> batchQuery(String[] snos);
    //public List<Student> batchQuery(List<String[]> snos);
    public List<Student> batchQuery(Map map);
}
