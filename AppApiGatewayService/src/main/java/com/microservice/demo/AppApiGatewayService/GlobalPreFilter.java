package com.microservice.demo.AppApiGatewayService;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class GlobalPreFilter implements GlobalFilter {

	final private Logger logger = LoggerFactory.getLogger(GlobalPreFilter.class);
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		logger.info("Global pre filter executed...");

		String requestPath = exchange.getRequest().getPath().toString();
		logger.info(String.format("Request path: %s", requestPath));

		HttpHeaders headers = exchange.getRequest().getHeaders();

		Set<String> headerNames = headers.keySet();

		headerNames.forEach((headerName)-> {

			String headerValue = headers.getFirst(headerName);
			logger.info(headerName + " " + headerValue);
		});

		return chain.filter(exchange);
	}

}