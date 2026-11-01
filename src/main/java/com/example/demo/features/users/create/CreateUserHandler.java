package com.example.demo.features.users.create;

import org.springframework.stereotype.Service;

import com.example.demo.features.users.domain.User;
import com.example.demo.features.users.domain.UserRepository;

import jakarta.transaction.Transactional;

@Service 
public class CreateUserHandler {
    
    UserRepository repository;

    public CreateUserHandler(UserRepository repo){
        this.repository = repo;
    }


    @Transactional
    public UserResponse handle(CreateUserCommand command) {

        User user = new User(
            command.userName(),
            command.email(),
            command.password()
        );

        User guardado = repository.save(user);

        return UserResponse.fromEntity(guardado);
    }

}
