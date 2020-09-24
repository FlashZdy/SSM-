package com.flash.service;

import com.flash.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User queryUserById(@Param("userId") int userId);

    User queryUserByName(@Param("userName")String userName);

    int addUser(@Param("user")User user);
}
