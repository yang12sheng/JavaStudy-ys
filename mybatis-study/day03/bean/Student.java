package com.ychs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student implements Serializable {
    private String sno;
    private String sname;
    private String phone;
    private Integer cid;
    private Integer catId;

//追加
    private Clazz clazz;
    private Cat cat;
}
