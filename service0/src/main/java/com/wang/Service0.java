package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description 第一个服务入口
 * @Author windpursuer
 * @Date 2017/6/6 16:03
 */
@SpringBootApplication
@EnableEurekaClient
public class Service0 {
    public static void main(String[] args) {
        SpringApplication.run(Service0.class, args);
    }
}
