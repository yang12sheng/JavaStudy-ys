package com.ychs.mapper;

import com.ychs.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param(value = "username") String username,@Param(value = "password") String password);
}
