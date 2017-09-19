package com.akuan.spring.cloud.service.impl;

import com.akuan.spring.cloud.service.HelloService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloServiceImpl
 * @Description: HelloServiceImpl
 * @author: zhaozhenkuan
 * @date: 2017-08-08 下午5:55
 * @version: V1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(@RequestParam(value = "name") String name) {
        return "hi " + name + " feign-hystrix 断路器阻断";
    }
}
