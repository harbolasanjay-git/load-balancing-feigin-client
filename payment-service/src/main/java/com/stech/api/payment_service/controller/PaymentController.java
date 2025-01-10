package com.stech.api.payment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    Environment environment;

    @GetMapping("/welcome")
    public String welcomeMethod(){
        return "Welcome to Payment Service " +environment.getProperty("server.port");
    }

}
