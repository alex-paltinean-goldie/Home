package com.home.main_service.user;

import com.home.main_service.security.UserRequestContext;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepository userRepository;
    private final UserRequestContext userRequestContext;

    @GetMapping
    public PublicResponse getDefaults() {
        return new PublicResponse(userRepository.findById(userRequestContext.getId()).get().getEmail());
    }

    public record PublicResponse(String text) {

    }
}

