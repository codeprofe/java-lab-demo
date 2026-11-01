package com.example.demo.features.users.create;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController 
@RequestMapping("/api/users")
public class CreateUserController {

    CreateUserHandler handler;

    public CreateUserController(CreateUserHandler handler){
        this.handler = handler;
    }
    
    @PostMapping 
    public ResponseEntity<UserResponse> getAllUsers(@RequestBody CreateUserCommand command) {
        
        UserResponse creado =  handler.handle(command);
        return ResponseEntity.ok(creado);
        
    }
    
}
