package com.home.main_service.base;

import com.home.main_service.security.UserRequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class SingletonBaseController<T extends BaseEntity, DTO extends BaseDTO> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseService<T> service;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseMapper<T, DTO> mapper;
    @Autowired
    private UserRequestContext userRequestContext;

    @GetMapping()
    public DTO get() {
        return mapper.toDTO(service.findByUserId(userRequestContext.getId()));
    }

    @PutMapping()
    public DTO update(@RequestBody DTO request) {
        T existingEntity = service.findById(request.getId());
        if (existingEntity != null && !existingEntity.getUserId().equals(request.getUserId())) {
            throw new RuntimeException();
        }
        T newEntity = mapper.toEntity(request);
        newEntity.setUserId(userRequestContext.getId());
        return mapper.toDTO(service.save(newEntity));
    }

    @DeleteMapping()
    public void delete() {
        service.deleteByUserId(userRequestContext.getId());
    }
}
