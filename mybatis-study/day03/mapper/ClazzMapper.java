package com.ychs.mapper;

import com.ychs.bean.Clazz;
import com.ychs.bean.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClazzMapper {


    public List<Clazz> getClazzes();
    //延迟加载
    public List<Clazz> getClazz();

    //缓冲
    public Clazz getClazzById(int id);



}
