package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.cart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
