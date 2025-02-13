package com.home.main_service.exercise;

import com.home.main_service.base.globalbase.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercises")
public class Exercise extends BaseEntity {
    private String title;
    private Integer priority;
    @Enumerated(EnumType.STRING)
    private ExerciseType exerciseType;
    @Enumerated(EnumType.STRING)
    private EquipmentCategory equipmentCategory;
    @Column(columnDefinition = "bit default false")
    private boolean volumeDoublingEnabled;

    // Head and Neck Muscles
    @Column(columnDefinition = "float default 0")
    private float sternocleidomastoid;
    @Column(columnDefinition = "float default 0")
    private float upperTrapezius;
    @Column(columnDefinition = "float default 0")
    private float middleTrapezius;
    @Column(columnDefinition = "float default 0")
    private float lowerTrapezius;

    // Shoulder Muscles
    @Column(columnDefinition = "float default 0")
    private float deltoidAnterior;
    @Column(columnDefinition = "float default 0")
    private float deltoidLateral;
    @Column(columnDefinition = "float default 0")
    private float deltoidPosterior;

    // Chest Muscles
    @Column(columnDefinition = "float default 0")
    private float upperPectoralisMajor;
    @Column(columnDefinition = "float default 0")
    private float middlePectoralisMajor;
    @Column(columnDefinition = "float default 0")
    private float lowerPectoralisMajor;
    @Column(columnDefinition = "float default 0")
    private float pectoralisMinor;

    // Arm Muscles
    @Column(columnDefinition = "float default 0")
    private float longHeadBicepsBrachii;
    @Column(columnDefinition = "float default 0")
    private float shortHeadBicepsBrachii;
    @Column(columnDefinition = "float default 0")
    private float longHeadTricepsBrachii;
    @Column(columnDefinition = "float default 0")
    private float lateralHeadTricepsBrachii;
    @Column(columnDefinition = "float default 0")
    private float medialHeadTricepsBrachii;
    @Column(columnDefinition = "float default 0")
    private float brachialis;

    // Forearm Muscles
    @Column(columnDefinition = "float default 0")
    private float forearmFlexors;
    @Column(columnDefinition = "float default 0")
    private float forearmExtensors;

    // Back Muscles
    @Column(columnDefinition = "float default 0")
    private float latissimusDorsi;
    @Column(columnDefinition = "float default 0")
    private float rhomboids;
    @Column(columnDefinition = "float default 0")
    private float erectorSpinae;

    // Abdominal Muscles
    @Column(columnDefinition = "float default 0")
    private float uperRectusAbdominis;
    @Column(columnDefinition = "float default 0")
    private float lowerRectusAbdominis;
    @Column(columnDefinition = "float default 0")
    private float externalObliques;
    @Column(columnDefinition = "float default 0")
    private float internalObliques;
    @Column(columnDefinition = "float default 0")
    private float transversusAbdominis;

    // Hip and Glute Muscles
    @Column(columnDefinition = "float default 0")
    private float gluteusMaximus;
    @Column(columnDefinition = "float default 0")
    private float gluteusMedius;

    // Leg Muscles
    @Column(columnDefinition = "float default 0")
    private float quadricepsFemoris;
    @Column(columnDefinition = "float default 0")
    private float hamstrings;
    @Column(columnDefinition = "float default 0")
    private float gastrocnemius;
    @Column(columnDefinition = "float default 0")
    private float soleus;
    @Column(columnDefinition = "float default 0")
    private float tibialisAnterior;
}

