package com.home.main_service.workout;

import com.home.main_service.base.BaseEntity;
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
public class ExerciseSet extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id", nullable = false)
    private WorkoutExercise exercise;

    private Integer reps;

    @Column(name = "set_index")
    private Integer setIndex;

    private SetIndicator indicator;

    @Column(name = "weight_kg")
    private Double weightKg;
}

