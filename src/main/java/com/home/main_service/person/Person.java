package com.home.main_service.person;


import com.home.main_service.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person extends BaseEntity {

    @Column
    private Gender gender;

    @Column
    private double height;

    @Column
    private double weight;

    @Column
    private Instant birthdate;

}
