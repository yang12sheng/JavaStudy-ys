package com.ychs.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class Cat implements Serializable {
    private  Integer id;
    private String name;
    private String type;


}
