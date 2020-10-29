package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.cart.model.Cart;

import java.util.List;

public interface ShoppingCartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByStatus(String status);
}
