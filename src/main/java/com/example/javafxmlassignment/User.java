package com.example.javafxmlassignment;


public class User {
    private final String password;
    private final String email;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
}