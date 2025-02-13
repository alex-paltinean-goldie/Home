package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


public class UserBaseService<E extends UserBaseEntity> extends BaseService<E> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserBaseRepository<E> repository;

    public E findByUserId(UUID userId) {
        return repository.findByUserId(userId).orElseThrow(RuntimeException::new);
    }

    public void deleteByUserId(UUID userId) {
        repository.deleteByUserId(userId);
    }
}
