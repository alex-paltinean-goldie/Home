package com.home.main_service.person;

import com.home.main_service.base.globalbase.BaseUpdateDTO;
import lombok.Data;

import java.time.Instant;

@Data
public class UpdatePersonDTO extends BaseUpdateDTO {
    private Gender gender;
    private int height;
    private float weight;
    private Instant birthdate;
}
