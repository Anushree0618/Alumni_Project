package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

	/*
	 * @Autowired private BCryptPasswordEncoder passwordEncoder;
	 */
    public boolean registerUser(Login user) {
      //  user.setPassword(passwordEncoder.encode(user.getPassword()));
        return loginRepository.registerUser(user) > 0;
    }

    public Optional<Login> authenticate(String username, String password) {
        Optional<Login> user = loginRepository.findByUsername(username);
		if (user.isPresent() /* && passwordEncoder.matches(password, user.get().getPassword()) */) {
            return user;
        }
        return Optional.empty();
    }
}
