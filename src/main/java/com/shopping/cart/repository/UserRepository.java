package com.shopping.cart.repository;

import com.shopping.cart.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
