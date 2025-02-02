package com.home.main_service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHasher {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "password"; // Change this
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println("Hashed Password: " + encodedPassword);
    }
}

