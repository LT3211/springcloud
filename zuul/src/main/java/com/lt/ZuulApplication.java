package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/5 14:15
 */

@EnableZuulProxy    /*包含了@EnableZuulServer，设置该类是网关启动类*/
@EnableAutoConfiguration  /*可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到当前SpringBoot创建并使用的IOC容器中*/
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
