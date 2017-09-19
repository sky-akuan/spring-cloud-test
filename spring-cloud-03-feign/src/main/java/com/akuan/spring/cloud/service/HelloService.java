package com.akuan.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: HelloService
 * @Description: HelloService
 * @author: zhaozhenkuan
 * @date: 2017-08-08 下午4:39
 * @version: V1.0
 */

@FeignClient(value = "eureka-client")
public interface HelloService {

    @GetMapping("/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
