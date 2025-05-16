package com.apollo.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ApigatewayApplication {

	public static void main(String[] args) {
		System.out.println("inside main");
		SpringApplication.run(ApigatewayApplication.class, args);
		System.out.println("started............");
	}

}
