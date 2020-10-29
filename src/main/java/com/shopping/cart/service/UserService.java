package com.shopping.cart.service;

import com.shopping.cart.domain.User;
import com.shopping.cart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("user1","user1@gmail.com","abc"));
        users.add(new User("user2","user2@gmail.com","def"));
    }

    public void saveInitialBatch(){
        userRepository.save(users);
    }

}
