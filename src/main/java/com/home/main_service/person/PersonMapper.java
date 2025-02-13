package com.home.main_service.person;

import com.home.main_service.base.globalbase.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<Person, PersonDTO, UpdatePersonDTO> {
}
