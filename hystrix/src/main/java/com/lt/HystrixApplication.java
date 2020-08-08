package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/6 12:24
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker   /*声明使用数据监控*/
@EnableHystrixDashboard     /*声明使用可视化数据监控*/
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}
