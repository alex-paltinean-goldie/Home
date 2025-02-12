package com.home.main_service.workout;

import com.home.main_service.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "workouts")
public class Workout extends BaseEntity {

    private String name;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "end_time")
    private Long endTime;

    @OneToMany(mappedBy = "workoutId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkoutExercise> workoutExercises;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "estimated_volume_kg")
    private Integer estimatedVolumeKg;
}

