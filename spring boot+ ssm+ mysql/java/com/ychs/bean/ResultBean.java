package com.ychs.bean;

import lombok.Data;

import java.util.List;

@Data
public class ResultBean<T> {
    private String code;
    private String msg;
    private Integer count;
    private List<T> data;
}
