package com.example.demo.Repositories;

import com.example.demo.models.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
