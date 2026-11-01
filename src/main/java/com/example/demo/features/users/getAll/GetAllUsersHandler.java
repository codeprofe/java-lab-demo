package com.example.demo.features.users.getAll;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.features.users.create.UserResponse;
import com.example.demo.features.users.domain.UserRepository;

@Service 
public class GetAllUsersHandler {
    
    UserRepository repository;

    public GetAllUsersHandler(UserRepository repo){
        this.repository = repo;
    }

    public List<UserResponse> handle(){
        return repository.findAll().stream().map(UserResponse::fromEntity).toList();
    }
}
