package com.akuan.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class SpringCloud12ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud12ZipkinServerApplication.class, args);
	}
}
