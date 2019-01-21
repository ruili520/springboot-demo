package com.loveayc.springaopdemo.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Wenbo
 * @Title: DoneTime
 * @ProjectName springboot-demo
 * @Description: TODO
 * @date 2019/1/2115:14
 */
@Target({ElementType.METHOD, ElementType.TYPE})
//这个注解就是表明该注解类能够作用的范围，也就是能够注解在哪，比如 类、方法、参数等。
@Retention(RetentionPolicy.RUNTIME)
public @interface DoneTime {
    String param() default "";
}


