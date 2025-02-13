package com.home.main_service.workout;

import com.home.main_service.base.userbase.UserBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercise_sets")
public class ExerciseSet extends UserBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id", nullable = false)
    private WorkoutExercise exercise;

    private Integer reps;

    private Integer setIndex;

    @Enumerated(EnumType.STRING)
    private SetIndicator indicator;

    private Double weightKg;
}

