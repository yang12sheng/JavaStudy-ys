package com.ychs.mapper;

import com.ychs.bean.Clazz;

import java.util.List;

public interface CatMapper {


    public List<Clazz> getClazzes();
    //延迟加载
    public List<Clazz> getClazz();



}
