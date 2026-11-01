package com.example.demo.features.users.getAll;


import org.springframework.stereotype.Service;

import com.example.demo.features.users.create.UserResponse;
import com.example.demo.features.users.domain.UserRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;


@Service 
@RequiredArgsConstructor 
public class GetAllUsersHandler {
    
    UserRepository repository;

    public List<UserResponse> handle(){
        return repository.findAll().stream().map(UserResponse::fromEntity).toList();
    }
}
