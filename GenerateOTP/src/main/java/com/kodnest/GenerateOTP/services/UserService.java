package com.kodnest.GenerateOTP.services;

import com.kodnest.GenerateOTP.entities.User;
import com.kodnest.GenerateOTP.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public void register(User user) {
        userRepo.save(user);
    }
}
