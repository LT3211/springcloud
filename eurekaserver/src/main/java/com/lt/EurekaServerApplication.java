package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/5 10:44
 */
@SpringBootApplication  /*声明该类是Spring Boot服务的入口*/
@EnableEurekaServer  /*声明该类是一个Eureka Server微服务，提供服务注册和服务发现功能，即注册中心*/
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
