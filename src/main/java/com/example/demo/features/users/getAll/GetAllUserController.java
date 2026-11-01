package com.example.demo.features.users.getAll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.features.users.create.UserResponse;

import java.util.List;

import lombok.RequiredArgsConstructor;




@RestController 
@RequestMapping("/api/users")
@RequiredArgsConstructor 
public class GetAllUserController {

    private final GetAllUsersHandler handler;
    
    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        return ResponseEntity.ok(handler.handle());
    }
    
}
