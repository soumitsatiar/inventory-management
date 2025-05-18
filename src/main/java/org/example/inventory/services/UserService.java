package org.example.inventory.services;

import org.example.inventory.entities.User;
import org.example.inventory.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public boolean checkIfUserExists(String email) {
        User user = userRepository.findByEmail(email);
        return user != null;
    }

}
