package com.ychs.mapper;

import com.ychs.bean.Major;

import java.util.List;

public interface MajorMapper {
    //查询满足条件的所有专业信息
    public List<Major> getMajorsByCondition(Major major);

    public Integer getCountByCondition(Major major);

    int addMajor(Major major);
}
