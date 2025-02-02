package com.home.main_service.publicc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {

    @GetMapping
    public PublicResponse getDefaults() {
        return new PublicResponse("testing2");
    }

    public record PublicResponse(String text) {

    }
}

