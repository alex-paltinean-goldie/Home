package com.home.main_service.person;

import com.home.main_service.base.userbase.UserBaseDTO;
import lombok.Data;

import java.time.Instant;

@Data
public class PersonDTO extends UserBaseDTO {
    private Gender gender;
    private int height;
    private float weight;
    private Instant birthdate;

}
