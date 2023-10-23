package com.ychs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String sno;
    private String sname;
    private String phone;
    private Integer cid;

//    private String cname;//追加 不推荐
    private String cno;
    private String name;
    //
    private Clazz clazz;
}
