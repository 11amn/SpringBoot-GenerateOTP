package com.kodnest.GenerateOTP.repositories;

import com.kodnest.GenerateOTP.entities.UserOtp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOTPRepository extends JpaRepository<UserOtp, Integer> {

    UserOtp findByOtp(String otp);
}
