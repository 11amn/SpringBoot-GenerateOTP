package com.kodnest.GenerateOTP.repositories;

import com.kodnest.GenerateOTP.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByEmailId(String emailId);
}
