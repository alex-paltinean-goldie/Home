package com.home.main_service.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping
    public PublicResponse getDefaults() {
        return new PublicResponse("admin");
    }

    public record PublicResponse(String text) {

    }
}

