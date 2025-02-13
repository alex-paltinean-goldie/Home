package com.home.main_service.base.globalbase;

import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<E extends BaseEntity, D extends BaseDTO, U extends BaseUpdateDTO> {
    D toDTO(E entity);

    List<D> toDTOs(List<E> entities);

    void update(@MappingTarget E entity, U updateRequest);

}
