package com.home.main_service.workout;

import com.home.main_service.base.userbase.UserBaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "workouts")
public class Workout extends UserBaseEntity {

    private String name;

    private Instant startTime;

    private Instant endTime;

    @OneToMany(mappedBy = "workoutId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkoutExercise> workoutExercises;

    private String description;

    private float estimatedVolumeKg;
}

