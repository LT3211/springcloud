package com.lt.controller;

import com.lt.entity.Student;
import com.lt.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author teng.li
 * @version 1.0
 * @date 2020/8/6 12:30
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignError;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignError.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignError.index();
    }
}
