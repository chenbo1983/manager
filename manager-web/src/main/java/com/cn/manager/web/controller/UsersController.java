package com.cn.manager.web.controller;

import com.cn.manager.pojo.Users;
import com.cn.manager.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersService.addUser(users);
        return "ok";
    }

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGet.........."+userid);
        return "ok";
    }
    /**
     * doPost
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doGet(Users users){
        System.out.println("doPost..........");
        System.out.println(users);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doPost.........."+userid);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut..........");
        return "ok";
    }

}
