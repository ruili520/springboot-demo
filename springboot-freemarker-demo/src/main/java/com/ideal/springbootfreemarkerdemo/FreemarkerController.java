package com.ideal.springbootfreemarkerdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FreemarkerController {

    @RequestMapping("/")
    public String testFreemarker(ModelMap modelmap){
        modelmap.addAttribute("msg", "Hello , this is freemarker页面，学习旅程开始吧");
        return "index";
    }
}
