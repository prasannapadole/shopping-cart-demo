package com.shopping.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CartApplication {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CartApplication.class, args);
		
	}

}
