package org.mihalka.workoutbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mihalka.workoutbackend.model.dto.UserDto;
import org.mihalka.workoutbackend.model.enums.UserRole;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
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


    public UserEntity(UserDto dto) {
        this.id=dto.getId();
        this.userName=dto.getUserName();
        this.passwordHash=dto.getPasswordHash();
        this.role= UserRole.valueOf(dto.getUserRole());
    }


}
