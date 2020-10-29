package com.shopping.cart.repository;

import com.shopping.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingCartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByStatus(String status);
}
