package com.cn.manager.service.impl;

import com.cn.manager.mapper.UsersMapper;
import com.cn.manager.pojo.Users;
import com.cn.manager.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
