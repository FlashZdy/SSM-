package com.flash.dao;

import com.flash.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    User queryUserById(@Param("userId") int userId);

    User queryUserByName(@Param("userName")String userName);

    int addUser(@Param("user")User user);
}
