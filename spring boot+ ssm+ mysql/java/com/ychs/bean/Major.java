package com.ychs.bean;

import lombok.Data;

@Data
public class Major extends PageBean{
    private Integer id;
    private String majorNo;
    private String majorName;
    private String remark;
    private Integer deptId;
}
