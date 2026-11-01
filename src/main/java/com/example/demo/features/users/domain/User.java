package com.example.demo.features.users.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Setter 
@Getter 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
@Table(name = "users")

public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String userName;

    String email;

    String password;
  
}
