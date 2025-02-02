package com.home.main_service.security;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
@Data
public class UserRequestContext {
    private String username;
    private Long id;
}

