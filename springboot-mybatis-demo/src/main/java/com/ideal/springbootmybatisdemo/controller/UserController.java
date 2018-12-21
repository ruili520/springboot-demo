package com.ideal.springbootmybatisdemo.controller;

import com.ideal.springbootmybatisdemo.dao.UserMapper;
import com.ideal.springbootmybatisdemo.entity.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    //http://localhost:8880/getUser?userName=xiaoli2
    @RequestMapping("/getUser")
    public String getUser(String userName){
        IUser user =userMapper.findUserByUsername(userName);
        return user!=null ? userName+"的密码是："+user.getUserPassword():"不存在用户名为"+userName+"的用户";
    }

    //http://localhost:8880/updateUser?userName=xiaoli2&userPassword=123
    @RequestMapping("/updateUser")
    public String updateUser(String userPassword,String userName){
        IUser user = new IUser(userName,userPassword);
        userMapper.updateUserByUsername(user);
        return "success!";
    }


    //http://localhost:8880/addUser?userName=xiaoli2&userPassword=123
    @RequestMapping("/addUser")
    public String addUser(String userName,String userPassword){
        IUser user = new IUser(userName,userPassword);
        userMapper.saveUser(user);
        return "success!";
    }

    //http://localhost:8880/addUser?userName=xiaoli2
    @RequestMapping("/deleteUser")
    public String deleteUser(String userName){
        userMapper.deleteUserByUsername(userName);
        return "success!";
    }

    //http://localhost:8880/getUserList
    @RequestMapping("/getUserList")
    public List getUserList(String userName, String userPassword){
        return userMapper.getUserList();
    }
}
