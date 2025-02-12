package com.home.main_service.exercise;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercises")
public class Exercise {
    @Id
    @Column(nullable = false)
    private UUID id;

    @Column
    private String title;

    @Column
    private Integer priority;

    @Column(name = "exercise_type")
    private ExerciseType exerciseType;

    @Column(name = "equipment_category")
    private EquipmentCategory equipmentCategory;

    @Column(name = "volume_doubling_enabled")
    private Boolean volumeDoublingEnabled;

    // Head and Neck Muscles
    @Column(name = "sternocleidomastoid")
    private Double sternocleidomastoid;

    @Column(name = "upper_trapezius")
    private Double upperTrapezius;

    @Column(name = "middle_trapezius")
    private Double middleTrapezius;

    @Column(name = "lower_trapezius")
    private Double lowerTrapezius;

    // Shoulder Muscles
    @Column(name = "deltoid_anterior")
    private Double deltoidAnterior;

    @Column(name = "deltoid_lateral")
    private Double deltoidLateral;

    @Column(name = "deltoid_posterior")
    private Double deltoidPosterior;

    // Chest Muscles
    @Column(name = "upper_pectoralis_major")
    private Double upperPectoralisMajor;

    @Column(name = "middle_pectoralis_major")
    private Double middlePectoralisMajor;

    @Column(name = "lower_pectoralis_major")
    private Double lowerPectoralisMajor;

    @Column(name = "pectoralis_minor")
    private Double pectoralisMinor;

    // Arm Muscles
    @Column(name = "long_head_biceps_brachii")
    private Double longHeadBicepsBrachii;

    @Column(name = "short_head_biceps_brachii")
    private Double shortHeadBicepsBrachii;

    @Column(name = "long_head_triceps_brachii")
    private Double longHeadTricepsBrachii;

    @Column(name = "lateral_head_triceps_brachii")
    private Double lateralHeadTricepsBrachii;

    @Column(name = "medial_head_triceps_brachii")
    private Double medialHeadTricepsBrachii;

    @Column(name = "brachialis")
    private Double brachialis;

    // Forearm Muscles
    @Column(name = "forearm_flexors")
    private Double forearmFlexors;

    @Column(name = "forearm_extensors")
    private Double forearmExtensors;

    // Back Muscles
    @Column(name = "latissimus_dorsi")
    private Double latissimusDorsi;

    @Column(name = "rhomboids")
    private Double rhomboids;

    @Column(name = "erector_spinae")
    private Double erectorSpinae;

    // Abdominal Muscles
    @Column(name = "upper_rectus_abdominis")
    private Double uperRectusAbdominis;

    @Column(name = "lower_rectus_abdominis")
    private Double lowerRectusAbdominis;

    @Column(name = "external_obliques")
    private Double externalObliques;

    @Column(name = "internal_obliques")
    private Double internalObliques;

    @Column(name = "transversus_abdominis")
    private Double transversusAbdominis;

    // Hip and Glute Muscles
    @Column(name = "gluteus_maximus")
    private Double gluteusMaximus;

    @Column(name = "gluteus_medius")
    private Double gluteusMedius;

    // Leg Muscles
    @Column(name = "quadriceps_femoris")
    private Double quadricepsFemoris;

    @Column(name = "hamstrings")
    private Double hamstrings;

    @Column(name = "gastrocnemius")
    private Double gastrocnemius;

    @Column(name = "soleus")
    private Double soleus;

    @Column(name = "tibialis_anterior")
    private Double tibialisAnterior;

}

