package com.example.demo.models.entities.users;

public record RegisterDTO(String login, String password, UserRole role) {
}
