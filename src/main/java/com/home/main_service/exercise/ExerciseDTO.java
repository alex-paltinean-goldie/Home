package com.home.main_service.exercise;

import com.home.main_service.base.globalbase.BaseDTO;
import com.home.main_service.person.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.Instant;

@Data
public class ExerciseDTO extends BaseDTO {
    private String title;
    private Integer priority;
    private ExerciseType exerciseType;
    private EquipmentCategory equipmentCategory;
    private boolean volumeDoublingEnabled;

    // Head and Neck Muscles
 
    private float sternocleidomastoid;
 
    private float upperTrapezius;
 
    private float middleTrapezius;
 
    private float lowerTrapezius;

    // Shoulder Muscles
 
    private float deltoidAnterior;
 
    private float deltoidLateral;
 
    private float deltoidPosterior;

    // Chest Muscles
 
    private float upperPectoralisMajor;
 
    private float middlePectoralisMajor;
 
    private float lowerPectoralisMajor;
 
    private float pectoralisMinor;

    // Arm Muscles
 
    private float longHeadBicepsBrachii;
 
    private float shortHeadBicepsBrachii;
 
    private float longHeadTricepsBrachii;
 
    private float lateralHeadTricepsBrachii;
 
    private float medialHeadTricepsBrachii;
 
    private float brachialis;

    // Forearm Muscles
 
    private float forearmFlexors;
 
    private float forearmExtensors;

    // Back Muscles
 
    private float latissimusDorsi;
 
    private float rhomboids;
 
    private float erectorSpinae;

    // Abdominal Muscles
 
    private float uperRectusAbdominis;
 
    private float lowerRectusAbdominis;
 
    private float externalObliques;
 
    private float internalObliques;
 
    private float transversusAbdominis;

    // Hip and Glute Muscles
 
    private float gluteusMaximus;
 
    private float gluteusMedius;

    // Leg Muscles
 
    private float quadricepsFemoris;
 
    private float hamstrings;
 
    private float gastrocnemius;
 
    private float soleus;
 
    private float tibialisAnterior;
}
