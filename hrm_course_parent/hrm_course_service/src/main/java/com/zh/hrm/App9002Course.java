package com.zh.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zh.hrm.mapper")
public class App9002Course {
    public static void main(String[] args) {
        SpringApplication.run(App9002Course.class,args);
    }
}
