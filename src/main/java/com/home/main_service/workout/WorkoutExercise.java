package com.home.main_service.workout;

import com.home.main_service.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "workout_exercises")
public class WorkoutExercise extends BaseEntity {
    @Column(name = "workout_id", nullable = false)
    private UUID workoutId;

    @Column(name = "exercise_id", nullable = false)
    private UUID exerciseId;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExerciseSet> sets;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(name = "superset_id")
    private int supersetId;

    @Column(name = "rest_seconds")
    private Integer restSeconds;
}

