package com.ychs.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


//Serializable  序列化和反序列化  见过
@Data
public class Clazz implements Serializable{
    private Integer id;
    private String cno;
    private String cname;
    //追加
    private List<Student> students;
}
