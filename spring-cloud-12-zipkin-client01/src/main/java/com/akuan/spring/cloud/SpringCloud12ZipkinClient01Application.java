package com.akuan.spring.cloud;

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

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@Slf4j
public class SpringCloud12ZipkinClient01Application {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/eat")
    public String eat(@RequestParam("food") String food) {
        log.info("吃 client01 eat " + food);
        return restTemplate.getForObject("http://zipkin-client02/drink?food=" + food, String.class);
    }

    @GetMapping("/play")
    public String play(@RequestParam("game") String game) {
        log.info("玩 client01 play " + game);
        return restTemplate.getForObject("http://zipkin-client02/enjoy?game=" + game, String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud12ZipkinClient01Application.class, args);
    }
}
