package com.home.main_service.person;

import com.home.main_service.base.BaseUpdateDTO;
import lombok.Data;

import java.time.Instant;

@Data
public class UpdatePersonDTO extends BaseUpdateDTO {
    private Gender gender;
    private double height;
    private double weight;
    private Instant birthdate;
}
