package com.example.instrument.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.instrument.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}