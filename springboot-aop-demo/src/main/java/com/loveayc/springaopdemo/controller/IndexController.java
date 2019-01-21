package com.loveayc.springaopdemo.controller;

import com.loveayc.springaopdemo.aspect.DoneTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wenbo
 * @Title: IndexController
 * @ProjectName springboot-demo
 * @Description: TODO
 * @date 2019/1/2115:28
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    @DoneTime(param = "IndexController")
    public String index(){
        System.out.println("方法执行");
        return "hello test";
    }

    @GetMapping("/index2")
    public String index2(){
        System.out.println("方法2执行");
        return "hello test1";
    }
}
