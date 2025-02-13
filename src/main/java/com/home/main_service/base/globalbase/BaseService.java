package com.home.main_service.base.globalbase;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;


public class BaseService<E extends BaseEntity> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseRepository<E> repository;

    public List<E> findAll() {
        return repository.findAll();
    }

    public E findById(UUID id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

}
