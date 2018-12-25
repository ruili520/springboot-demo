package com.iedal.springbootlombokdemo.controller;

import com.iedal.springbootlombokdemo.entity.NoLombokUser;
import com.iedal.springbootlombokdemo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/testUser")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("springboot");
        user.setPassword("123");
        System.out.println(user.toString());
        return user;
    }

    @GetMapping("/testNoLombok")
    public NoLombokUser getNoUser(){
        NoLombokUser noLombokUser = new NoLombokUser();
        noLombokUser.setId(1);
        noLombokUser.setName("springboot");
        noLombokUser.setPassword("466");
        System.out.println(noLombokUser.toString());
        return noLombokUser;
    }
}
