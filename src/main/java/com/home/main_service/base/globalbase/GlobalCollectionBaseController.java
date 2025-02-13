package com.home.main_service.base.globalbase;

import com.home.main_service.base.globalbase.BaseController;
import com.home.main_service.base.globalbase.BaseDTO;
import com.home.main_service.base.globalbase.BaseEntity;
import com.home.main_service.base.globalbase.BaseUpdateDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


public class GlobalCollectionBaseController<E extends BaseEntity, D extends BaseDTO, U extends BaseUpdateDTO> extends BaseController<E, D, U> {

    @GetMapping()
    public List<D> get() {
        return mapper.toDTOs(service.findAll());
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("{id}")
    public D update(@PathVariable UUID id, @RequestBody U request) {
        E entity = service.findById(id);
        mapper.update(entity, request);
        return mapper.toDTO(service.save(entity));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}
