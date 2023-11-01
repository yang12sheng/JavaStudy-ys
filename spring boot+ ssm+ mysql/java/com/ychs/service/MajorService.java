package com.ychs.service;

import com.ychs.bean.Major;
import com.ychs.bean.ResultBean;

public interface MajorService {
    public ResultBean<Major> getMajorsByCondition(Major major);

    int addMajor(Major major);
}
