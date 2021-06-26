package com.example.plus.controller;

import com.example.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("getpage")
    public Object findPage(){
        return  this.userService.selectUserPage(1,2);
    }

    @GetMapping("findusers")
    public Object findusers(){
        return  this.userService.queryAll();
    }

}
