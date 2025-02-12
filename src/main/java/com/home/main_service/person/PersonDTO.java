package com.home.main_service.person;

import com.home.main_service.base.BaseDTO;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.UUID;

@Data
public class PersonDTO extends BaseDTO {
    private UUID id;
    private Gender gender;
    private double height;
    private double weight;
    private Instant birthdate;

}
