package com.example.demo.features.users.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "users")

public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String userName;

    String email;

    String password;

        // Constructor vacío requerido por JPA
    protected User() {
    }

    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;

    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


    
}
