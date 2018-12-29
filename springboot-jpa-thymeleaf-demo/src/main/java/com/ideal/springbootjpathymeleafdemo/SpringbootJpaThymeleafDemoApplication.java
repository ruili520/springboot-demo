package com.ideal.springbootjpathymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//启动类需要添加Servlet的支持
@SpringBootApplication
public class SpringbootJpaThymeleafDemoApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJpaThymeleafDemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaThymeleafDemoApplication.class, args);
    }

}

