package com.ideal.springbootjpademo.controller;


import com.ideal.springbootjpademo.entity.JpaUser;
import com.ideal.springbootjpademo.service.JpaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JpaUserController {
    @Autowired
    private JpaUserService jpaUserService;

    @GetMapping("/saveUser")
    //  使用链接参考：http://localhost:8881/saveUser?name=测试账户&age=2018
    public JpaUser saveUser(String name,Integer age){
        return jpaUserService.save(name,age);
    }

    @GetMapping("/deleteUser")
    //  使用链接参考：http://localhost:8881/deleteUser?id=1
    public String deleteUser(Integer id){
        return jpaUserService.deleteUser(id);
    }

    @GetMapping("/findAll")
    //  使用链接参考：http://localhost:8881/findAll
    public List<JpaUser> getAll(){
        return jpaUserService.getAll();
    }

    @GetMapping("/updataUser")
    //  使用链接参考：http://localhost:8881/updataUser?id=2&name=修改账户&age=2019
    public String updataUser(Integer id,String name,Integer age){
        return jpaUserService.updataUser(id,name,age);
    }

}
