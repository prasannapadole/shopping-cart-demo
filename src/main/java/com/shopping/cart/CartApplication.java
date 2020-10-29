package com.shopping.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.shopping.cart.service.ProductService;
import com.shopping.cart.service.UserService;

@SpringBootApplication
@EnableJpaAuditing
public class CartApplication {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CartApplication.class, args);

		ProductService productService = applicationContext.getBean(ProductService.class);
		productService.saveInitialBatch();

		UserService userService = applicationContext.getBean(UserService.class);
		userService.saveInitialBatch();


	}

}
