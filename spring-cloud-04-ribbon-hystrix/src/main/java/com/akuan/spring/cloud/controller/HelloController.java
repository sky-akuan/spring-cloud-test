package com.akuan.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akuan.spring.cloud.service.HelloServiceImpl;

/**
 * @ClassName: HelloController
 * @Description: HelloController
 * @author: zhaozhenkuan
 * @date: 2017-08-08 下午12:15
 * @version: V1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloServiceImpl helloService;

    @GetMapping("/hi")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
