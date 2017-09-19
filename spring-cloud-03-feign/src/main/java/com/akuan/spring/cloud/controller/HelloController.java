package com.akuan.spring.cloud.controller;

import com.akuan.spring.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Description: HelloController
 * @author: zhaozhenkuan
 * @date: 2017-08-08 下午4:39
 * @version: V1.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hello(String name) {
        return helloService.sayHi(name);
    }
}
