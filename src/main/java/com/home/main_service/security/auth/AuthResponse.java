package com.home.main_service.security.auth;

import java.util.UUID;

public record AuthResponse(String token, UUID userId) {

}

