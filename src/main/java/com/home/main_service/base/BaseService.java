package com.home.main_service.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;


public class BaseService<T extends BaseEntity> {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private BaseRepository<T> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(UUID id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }

    public T findByUserId(UUID userId) {
        return repository.findByUserId(userId).orElseThrow(RuntimeException::new);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public void deleteByUserId(UUID userId) {
        repository.deleteByUserId(userId);
    }
}
