package com.ideal.springbootupdowndemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//页面跳转控制层
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
