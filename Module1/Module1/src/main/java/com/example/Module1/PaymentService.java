package com.example.Module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class PaymentService {
    public void pay(){
        System.out.println("Paying...");
    }

    @PostConstruct
    public void befor(){
        System.out.print("Before paying....");
    }
    @PreDestroy
    public void after(){
        System.out.print("After payment done...."); //bean is destroyed when we stop as tomcat server is stopped
    }
}