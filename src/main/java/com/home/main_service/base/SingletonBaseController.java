package com.home.main_service.base;

import com.home.main_service.security.UserRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class SingletonBaseController<T extends BaseEntity, R extends BaseDTO, U extends BaseUpdateDTO> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseService<T> service;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseMapper<T, R, U> mapper;
    @Autowired
    private UserRequestContext userRequestContext;

    @GetMapping()
    public R get() {
        return mapper.toDTO(service.findByUserId(userRequestContext.getId()));
    }

    @PutMapping()
    public R update(@RequestBody U request) {
        T entity = service.findByUserId(userRequestContext.getId());
        mapper.update(entity, request);
        return mapper.toDTO(service.save(entity));
    }

    @DeleteMapping()
    public void delete() {
        service.deleteByUserId(userRequestContext.getId());
    }
}
