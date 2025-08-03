package com.clout_merchant_api.clout_merchant_api.service;

import com.clout_merchant_api.clout_merchant_api.entity.User;
import com.clout_merchant_api.clout_merchant_api.entity.UserRole;
import com.clout_merchant_api.clout_merchant_api.repository.UserRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User registerUser(String username, String password, String email, UserRole role) {
        if (userRepository.existsByUsername(username)) {
            throw new IllegalArgumentException("Username already exists");
        }
        if (userRepository.existsByEmail(email)) {
            throw new IllegalArgumentException("Email already exists");
        }

        User user = new User(username, password, email, role);
        return userRepository.save(user);
    }
}
