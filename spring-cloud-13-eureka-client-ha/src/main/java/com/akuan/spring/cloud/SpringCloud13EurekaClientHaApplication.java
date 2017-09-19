package com.akuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloud13EurekaClientHaApplication {
    @GetMapping("/hi")
    public String hi(String name) {
        return "hi" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud13EurekaClientHaApplication.class, args);
    }
}
