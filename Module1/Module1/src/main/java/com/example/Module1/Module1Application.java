package com.example.module1;

// Correct import of PaymentService from the same package
import com.example.Module1.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {

	// Spring injects the same PaymentService bean here
	@Autowired
	PaymentService paymentServiceObj1;

	// Spring injects the same PaymentService bean here also
	@Autowired
	PaymentService paymentServiceObj2;

	public static void main(String[] args) {
		// Starts Spring Boot and creates all beans
		SpringApplication.run(com.example.module1.Module1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Printing hashcodes to check if both are same bean (singleton)
		System.out.println(paymentServiceObj1.hashCode());
		System.out.println(paymentServiceObj2.hashCode());

		// Calling method using both references
		paymentServiceObj1.pay();
		paymentServiceObj2.pay();
	}
}
