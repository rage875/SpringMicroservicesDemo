package com.microservice.demo.AppUsersService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class AppUsersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppUsersServiceApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPassowrdEncoder(){
		return new BCryptPasswordEncoder();
	}
	
}
