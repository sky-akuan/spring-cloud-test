package com.akuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud13EurekaHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud13EurekaHaApplication.class, args);
	}
}
