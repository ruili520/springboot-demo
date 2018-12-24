package com.ideal.springbootsettimedemo;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestTimer {

    @Scheduled(cron = "0/1 * * * * ?")
    public void TestTimer(){
        System.out.println("执行定时任务的时间是："+new Date());
    }
}
