package com.akuan.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaClientApplication {
    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hi")
    public String hi(String name) {
        return "hi " + name + " ,i am from " + port;
    }


    @GetMapping("/getServices")
    public List<String> getServices() {
        return discoveryClient.getServices();
    }


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
