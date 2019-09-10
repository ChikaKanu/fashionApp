package com.example.codeclan.fashion.repository;

import com.example.codeclan.fashion.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
}
