package com.akuan.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }

    public String helloError(String name) {
        return "hi " + name + " 断路器阻断";
    }

}
