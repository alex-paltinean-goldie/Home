package com.home.main_service.base.globalbase;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.UUID;

@Data
public class BaseDTO {
    protected UUID id;

    protected Instant createdAt;

    protected Instant updatedAt;
}
