package com.stech.api.payment_service;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceApplication {

	public static void main(String[] args) {
		// Run instance 1 on port 9092
        SpringApplication app1 = new SpringApplication(
        		PaymentServiceApplication.class);
        app1.setDefaultProperties(Map.of("server.port", 9092));
        app1.run(args);

        // Run instance 2 on port 9093
        SpringApplication app2 = new SpringApplication(
        		PaymentServiceApplication.class);
        app2.setDefaultProperties(Map.of("server.port", 9093));
        app2.run(args);
	}

}
