package com.home.main_service.user;


import com.home.main_service.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends BaseEntity {
    @Column
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;  // Example: "ROLE_USER" or "ROLE_ADMIN"

}
