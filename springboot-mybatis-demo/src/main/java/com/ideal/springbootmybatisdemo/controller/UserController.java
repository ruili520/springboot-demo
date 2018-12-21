package com.ideal.springbootmybatisdemo.controller;

import com.ideal.springbootmybatisdemo.dao.UserMapper;
import com.ideal.springbootmybatisdemo.entity.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    //http://localhost:8880/getUser?username=xiaoli2
    @RequestMapping("/getUser")
    public String getUser(String username){
        IUser user =userMapper.findUserByUsername(username);
        return user!=null ? username+"的密码是："+user.getUserPassword():"不存在用户名为"+username+"的用户";
    }

    //http://localhost:8880/updateUser?username=xiaoli2&password=123
    @RequestMapping("/updateUser")
    public String updateUser(String password,String username){
        IUser user = new IUser(username,password);
        userMapper.updateUserByUsername(user);
        return "success!";
    }


    //http://localhost:8880/addUser?username=xiaoli2&password=123
    @RequestMapping("/addUser")
    public String addUser(String username,String password){
        IUser user = new IUser(username,password);
        userMapper.saveUser(user);
        return "success!";
    }

    //http://localhost:8880/addUser?username=xiaoli2
    @RequestMapping("/deleteUser")
    public String deleteUser(String username){
        userMapper.deleteUserByUsername(username);
        return "success!";
    }

    //http://localhost:8880/getUserList
    @RequestMapping("/getUserList")
    public List getUserList(String username, String password){
        return userMapper.getUserList();
    }
}
