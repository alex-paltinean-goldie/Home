package com.home.main_service.security.auth;

import com.home.main_service.security.JwtUtil;
import com.home.main_service.user.User;
import com.home.main_service.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        if (userRepository.findByEmail(authRequest.getUsername()).isPresent()) {
            String token = jwtUtil.generateToken(authRequest.getUsername());
            return new AuthResponse(token, authRequest.getUsername());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    @PostMapping("/signup")
    public AuthResponse signup(@RequestBody AuthRequest authRequest) {
        if (userRepository.findByEmail(authRequest.getUsername()).isEmpty()) {
            userRepository.save(User.builder()
                    .email(authRequest.getUsername())
                    .password(passwordEncoder.encode(authRequest.getPassword()))
                    .role("ROLE_USER")
                    .build());
            String token = jwtUtil.generateToken(authRequest.getUsername());
            return new AuthResponse(token, authRequest.getUsername());
        } else {
            throw new RuntimeException("User already present");
        }
    }
}
