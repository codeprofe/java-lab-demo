package com.example.demo.features.users.create;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
@RequestMapping("/api/users")
@RequiredArgsConstructor 
public class CreateUserController {

    private final CreateUserHandler handler;

    @PostMapping 
    public ResponseEntity<UserResponse> getAllUsers(@RequestBody CreateUserCommand command) {
        
        UserResponse creado =  handler.handle(command);
        return ResponseEntity.ok(creado);
        
    }
    
}
