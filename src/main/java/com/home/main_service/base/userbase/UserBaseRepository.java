package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface UserBaseRepository<T extends UserBaseEntity> extends BaseRepository<T> {

    Optional<T> findByUserId(UUID userId);

    void deleteByUserId(UUID userId);
}
