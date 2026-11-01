package com.example.demo.features.users.create;

import com.example.demo.features.users.domain.User;

public record UserResponse(
    Long id,
    String userName,
    String email,
    String password
) {
    public static UserResponse fromEntity(User user){
        return new UserResponse(user.getId(), user.getUserName(), user.getEmail(), user.getPassword());
    }
}