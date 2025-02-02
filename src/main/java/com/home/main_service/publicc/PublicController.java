package com.home.main_service.publicc;

import com.home.main_service.security.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {
    private static final Logger logger = LoggerFactory.getLogger(PublicController.class);

    @GetMapping
    public PublicResponse getDefaults() {
        logger.info("GET public teest");
        return new PublicResponse("testing2");
    }

    public record PublicResponse(String text) {

    }
}

