package com.shopping.cart.repository;

import org.springframework.data.repository.CrudRepository;

import com.shopping.cart.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
