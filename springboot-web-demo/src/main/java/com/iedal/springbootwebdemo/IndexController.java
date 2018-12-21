package com.iedal.springbootwebdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "你好，这是新建的第一个springboot项目，你的学习之旅即将开始";
    }
}
