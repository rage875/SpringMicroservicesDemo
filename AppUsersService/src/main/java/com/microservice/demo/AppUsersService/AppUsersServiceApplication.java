package com.microservice.demo.AppUsersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppUsersServiceApplication.class, args);
	}

}
