package org.mihalka.workoutbackend.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.mihalka.workoutbackend.model.enums.UserRole;

@Entity
@Data
@Table(name = "users")
public class UserEntity {


    @Id
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;




}
