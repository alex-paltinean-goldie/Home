package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseDTO;
import com.home.main_service.base.globalbase.BaseUpdateDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class SingletonUserBaseController<T extends UserBaseEntity, R extends BaseDTO, U extends BaseUpdateDTO> extends UserBaseController<T, R, U> {

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
