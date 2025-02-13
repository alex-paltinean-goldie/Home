package com.home.main_service.base.userbase;

import com.home.main_service.base.globalbase.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.UUID;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class UserBaseEntity extends BaseEntity {
    @Column(name = "user_id")
    protected UUID userId;
}
