package com.ychs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer sno;
    private String sname;
    private String phone;
    private String cid;
   // private String cname;  //追加 不推荐
    private Clazz clazz;
}
