package com.home.main_service.base;

import org.mapstruct.MappingTarget;

public interface BaseMapper<T extends BaseEntity, DTO extends BaseDTO, U extends BaseUpdateDTO> {
    DTO toDTO(T entity);

    void update(@MappingTarget T entity, U updateRequest);

}
