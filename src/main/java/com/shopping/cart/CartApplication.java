package com.shopping.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.shopping.cart.manager.ProductManager;
import com.shopping.cart.manager.UserManager;

@SpringBootApplication
@EnableJpaAuditing
public class CartApplication {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CartApplication.class, args);
		ProductManager productService = applicationContext.getBean(ProductManager.class);
		productService.saveInitialBatch();
		UserManager userService = applicationContext.getBean(UserManager.class);
		userService.saveInitialBatch();
	}

}
