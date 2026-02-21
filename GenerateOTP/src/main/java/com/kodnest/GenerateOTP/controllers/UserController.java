package com.kodnest.GenerateOTP.controllers;

import com.kodnest.GenerateOTP.entities.User;
import com.kodnest.GenerateOTP.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

}
