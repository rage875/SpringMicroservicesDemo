package com.microservice.demo.AppAccountMngmtService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppAccountMngmtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAccountMngmtServiceApplication.class, args);
	}

}
