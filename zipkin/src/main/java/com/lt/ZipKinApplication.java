package com.lt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/8 21:02
 */
@SpringBootApplication
@EnableZipkinServer /*声明启动Zipkin Server*/
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}
