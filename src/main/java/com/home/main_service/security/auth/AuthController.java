package com.home.main_service.security.auth;

import com.home.main_service.person.Person;
import com.home.main_service.person.PersonService;
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
    private final PersonService personService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        User user = userRepository.findByEmail(authRequest.getUsername()).orElseThrow(() -> new RuntimeException("Invalid credentials"));
        String token = jwtUtil.generateToken(authRequest.getUsername());
        return new AuthResponse(token, user.getId());
    }

    @PostMapping("/signup")
    public AuthResponse signup(@RequestBody AuthRequest authRequest) {
        if (userRepository.findByEmail(authRequest.getUsername()).isEmpty()) {
            User savedUser = userRepository.save(User.builder()
                    .email(authRequest.getUsername())
                    .password(passwordEncoder.encode(authRequest.getPassword()))
                    .role("ROLE_USER")
                    .build());
            Person entity = new Person();
            entity.setUserId(savedUser.getId());
            personService.save(entity);
            String token = jwtUtil.generateToken(authRequest.getUsername());
            return new AuthResponse(token, savedUser.getId());
        } else {
            throw new RuntimeException("User already present");
        }
    }
}
