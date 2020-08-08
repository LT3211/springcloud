package com.lt.feign.impl;

import com.lt.entity.Student;
import com.lt.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/5 15:52
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
