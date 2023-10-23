package com.ychs.mapper;

import com.ychs.bean.User;

import java.util.HashMap;
import java.util.List;

/**
 * 如果使用代理的开发方式：
 * 1、接口的名称和 xml 文件的名称必须保持一致
 * 2、xml中 namespace 是接口所在的位置（包名+类名）
 * 3、接口中方法的名称必须和xml 中id 的名称一样
 * 4、接口中方法参数类型 和xml 中参数类型匹配
 * 5、接口中方法返回值类型和 xml 中返回值类型相匹配
 */
public interface StudentMapper {
    public List<User> getUsers();

    public User getUserByCid(int cid);

    public int addUser(User user);

    public int deleteUserById(int id);
    public int editUser(User user);

    public List<Studnet> getStudents(Student student);
    public List<Studnet>  getStusByNameAndCname(Student student);
    public HashMap  getStuBySno(Map  map);
}
