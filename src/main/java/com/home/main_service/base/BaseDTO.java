package com.home.main_service.base;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.UUID;

@Data
public class BaseDTO {
    protected UUID id;

    protected UUID userId;

    protected Instant createdAt;

    protected Instant updatedAt;
}
