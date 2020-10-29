package com.shopping.cart.repository;

import com.shopping.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sahan on 4/9/2016.
 */
public interface ShoppingCartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByStatus(String status);
}
