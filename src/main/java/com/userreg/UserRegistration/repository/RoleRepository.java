package com.userreg.UserRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userreg.UserRegistration.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	 Role findByName(String name);
}
