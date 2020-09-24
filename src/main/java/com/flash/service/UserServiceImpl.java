package com.flash.service;

import com.flash.dao.UserMapper;
import com.flash.pojo.User;

public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserById(int userId) {
        return userMapper.queryUserById(userId);
    }

    @Override
    public User queryUserByName(String userName) { return userMapper.queryUserByName(userName); }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
