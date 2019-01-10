package com.cn.manager.mapper;


import com.cn.manager.pojo.Users;

import java.util.List;

public interface UsersMapper {

    void insertUser(Users users);


    List<Users> selectUserAll();
}
