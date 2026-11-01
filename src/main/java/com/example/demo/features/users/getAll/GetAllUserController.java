package com.example.demo.features.users.getAll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.features.users.create.UserResponse;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController 
@RequestMapping("/api/users")
public class GetAllUserController {

    GetAllUsersHandler handler;

    public GetAllUserController(GetAllUsersHandler handler){
        this.handler = handler;
    }
    
    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return ResponseEntity.ok(handler.handle());
    }
    
}
