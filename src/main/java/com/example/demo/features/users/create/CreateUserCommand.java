package com.example.demo.features.users.create;

public record CreateUserCommand(
    String userName,
    String email,
    String password
) {}