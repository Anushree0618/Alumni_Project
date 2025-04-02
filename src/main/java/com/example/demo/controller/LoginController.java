package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;



@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/register")
    public String register(@RequestBody Login user) {
        if (loginService.registerUser(user)) {
            return "User registered successfully";
        }
        return "Registration failed";
    }

    @PostMapping("/login")
    public Login login(@RequestBody Login user) {
        Optional<Login> authenticatedUser = loginService.authenticate(user.getUsername(), user.getPassword());
        return authenticatedUser.orElse(null);
    }
}
