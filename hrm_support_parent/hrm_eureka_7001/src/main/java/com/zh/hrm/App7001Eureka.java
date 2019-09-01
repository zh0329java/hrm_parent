package com.zh.hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App7001Eureka {
    public static void main(String[] args) {
        SpringApplication.run(App7001Eureka.class,args);
    }
}
