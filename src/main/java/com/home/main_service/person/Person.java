package com.home.main_service.person;


import com.home.main_service.base.userbase.UserBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person extends UserBaseEntity {

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    private int height;

    @Column
    private float weight;

    @Column
    private Instant birthdate;

}
