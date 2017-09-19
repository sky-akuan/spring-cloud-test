package com.akuan.spring.cloud.service;

import com.akuan.spring.cloud.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloService
 * @Description: HelloService
 * @author: zhaozhenkuan
 * @date: 2017-08-08 下午4:39
 * @version: V1.0
 */

@FeignClient(value = "eureka-client", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
