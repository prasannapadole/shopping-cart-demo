package com.shopping.cart.manager;

import com.shopping.cart.model.User;
import com.shopping.cart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserManager {
    @Autowired
    private UserRepository userRepository;

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("user1","user1@gmail.com","abc"));
        users.add(new User("user2","user2@gmail.com","def"));
        users.add(new User("user3","user3@gmail.com","ghi"));
        users.add(new User("user4","user4@gmail.com","jkl"));
    }

    public void saveInitialBatch(){
        userRepository.save(users);
    }

}
