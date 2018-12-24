package com.ideal.springbootsettimedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootSettimeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSettimeDemoApplication.class, args);
    }

}

