package com.userreg.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userreg.UserRegistration.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
}