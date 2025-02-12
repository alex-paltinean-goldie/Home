package com.home.main_service.base;

public interface BaseMapper<T extends BaseEntity, DTO extends BaseDTO> {
    DTO toDTO(T entity);

    T toEntity(DTO dto);

}
