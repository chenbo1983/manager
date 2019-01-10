package com.cn.manager.test;

import com.cn.manager.mapper.UsersMapper;
import com.cn.manager.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: chenbo
 * @Date: 2019/1/10
 * @Description: com.cn.manager.test
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setAge(60);
        users.setUsername("admin2");
        this.usersMapper.insertUser(users);
    }
}
