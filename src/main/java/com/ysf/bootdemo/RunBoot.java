package com.ysf.bootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description com.ysf.bootdemo
 * @data 2020/4/25
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ysf.bootdemo.dao")
public class RunBoot {
    public static void main(String[] args) {
        SpringApplication.run(RunBoot.class,args);
    }
}
