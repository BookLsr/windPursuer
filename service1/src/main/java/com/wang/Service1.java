package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description 服务一的入口
 * @Author windpursuer
 * @Date 2017/6/8 17:18
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1 {
    public static void main(String[] args) {
        SpringApplication.run(Service1.class, args);
    }
}
