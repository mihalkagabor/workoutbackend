package org.mihalka.workoutbackend.model.dto;

import lombok.Data;
import org.mihalka.workoutbackend.model.entity.UserEntity;

@Data
public class UserDto {
    private Long id;
    private String userName;
    private String passwordHash;
    private String userRole;

    public UserDto (UserEntity user) {
        this.id=user.getId();
        this.userName=user.getUserName();
        this.passwordHash=user.getPasswordHash();
        this.userRole= String.valueOf(user.getRole());
    }
}
