package com.home.main_service.exercise;

import com.home.main_service.base.globalbase.BaseMapper;
import com.home.main_service.base.globalbase.BaseUpdateDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper extends BaseMapper<Exercise, ExerciseDTO, BaseUpdateDTO> {
}
