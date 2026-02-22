package com.kodnest.GenerateOTP.controllers;

import com.kodnest.GenerateOTP.entities.User;
import com.kodnest.GenerateOTP.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userServ;

    @GetMapping("/")
    public String displaySignUpPage() {
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userServ.register(user);
        System.out.println("Registration Successful");
        return "login";
    }

    @GetMapping("/login")
    public String displayLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String emailId, @RequestParam String password) {
        boolean status = userServ.loginAndGenerateOTP(emailId, password);
        if(status == true) {
            return "otp";
        } else {
            return "loginfail";
        }

    }

    @PostMapping("/verifyotp")
    public String verifyOTP(@RequestParam String otp) {
        boolean status = userServ.verifyOtp(otp);
        if (status == true) {
            return "homepage";
        } else {
            return "loginfail";
        }
    }
}
