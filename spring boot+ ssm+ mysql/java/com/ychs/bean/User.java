package com.ychs.bean;

import lombok.Data;

@Data
public class User extends PageBean{
    private String username;
    private String password;
    private String realname;

}
