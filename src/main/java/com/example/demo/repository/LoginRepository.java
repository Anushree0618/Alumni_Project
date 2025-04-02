package com.example.demo.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;

import java.util.Optional;

@Repository
public class LoginRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int registerUser(Login user) {
        String sql = "INSERT INTO login (Username, Password, Email, Contact, Logintype) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getContact(), user.getLogintype());
    }

    public Optional<Login> findByUsername(String username) {
        String sql = "SELECT * FROM login WHERE Username = ?";
        return Optional.empty();
    }
}