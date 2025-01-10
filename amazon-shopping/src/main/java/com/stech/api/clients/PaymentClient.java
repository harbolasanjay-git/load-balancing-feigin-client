package com.stech.api.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="PAYMENT-SERVICE")
public interface PaymentClient {
	@GetMapping("/api/welcome")
		public String getPaymentStatus();
}
