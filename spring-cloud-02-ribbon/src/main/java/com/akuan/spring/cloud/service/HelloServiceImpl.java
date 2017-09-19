package com.akuan.spring.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: HelloServiceImpl
 * @Description: HelloServiceImpl
 * @author: zhaozhenkuan
 * @date: 2017-08-08 上午11:30
 * @version: V1.0
 */
@Service
public class HelloServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

}
