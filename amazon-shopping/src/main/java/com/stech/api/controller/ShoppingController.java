package com.stech.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stech.api.clients.PaymentClient;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	@Autowired
	private PaymentClient paymentClient;

	@GetMapping("/getPayment")
	public String paymentStatus() {
		System.out.println("This is load balancing demo using feing client and eureka!!");
		return paymentClient.getPaymentStatus();
	}
}
