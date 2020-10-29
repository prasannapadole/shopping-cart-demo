package com.shopping.cart.repository;

import com.shopping.cart.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sahan on 4/8/2016.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
