package com.home.main_service.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, UUID> {


    //    @Query("select e from #{#entityName} e where e.userId=?1")
    Optional<T> findByUserId(UUID userId);

    void deleteByUserId(UUID userId);
}
