package com.microservice.demo.AppApiConfigServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigServer
public class AppApiConfigServerApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(AppApiConfigServerApplication.class);

	@Autowired
	private Environment env;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info(String.format("SearchLoc: %s",
				env.getProperty("spring.cloud.config.server.native.searchLocations")));
		logger.info(String.format("Token: %s",
				env.getProperty("token.secret")));
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApiConfigServerApplication.class, args);

	}

}
