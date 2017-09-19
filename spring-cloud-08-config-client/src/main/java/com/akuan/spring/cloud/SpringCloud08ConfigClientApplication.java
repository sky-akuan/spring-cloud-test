package com.akuan.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloud08ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud08ConfigClientApplication.class, args);
    }

    @Value("${apple}")
    String apple;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "hi " + apple + " from config";
    }
}
