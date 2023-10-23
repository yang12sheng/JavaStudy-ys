package com.ychs.mapper;


import com.ychs.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User login(@Param("username")String username, @Param("password")String password);
}
