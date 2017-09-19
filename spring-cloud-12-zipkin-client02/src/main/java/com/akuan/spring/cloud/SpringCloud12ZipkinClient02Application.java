package com.akuan.spring.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@Slf4j
public class SpringCloud12ZipkinClient02Application {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/drink")
    public String eat(@RequestParam("food") String food) {
        log.info("喝 client02 drink " + food);
//        return "喝 client02 drink " + food;
        return restTemplate.getForObject("http://zipkin-client01:8121/play?game=" + food, String.class);
    }

    @GetMapping("/enjoy")
    public String enjoy(@RequestParam("game") String game) {
        log.info("乐 client02 play " + game);
        return "乐 client02 play " + game;
        //        return restTemplate.getForObject("http://zipkin-client01/?game=" + game, String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud12ZipkinClient02Application.class, args);
    }
}
