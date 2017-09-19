package com.akuan.spring.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloud10ConfigClientHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud10ConfigClientHaApplication.class, args);
	}
    @Value("${apple}")
    String apple;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "hi " + apple + " from ha config ";
    }
}
