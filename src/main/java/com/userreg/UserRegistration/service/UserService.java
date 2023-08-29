package com.userreg.UserRegistration.service;

import java.util.List;

import com.userreg.UserRegistration.dto.UserDto;
import com.userreg.UserRegistration.entity.User;

public interface UserService {
	void saveUser(UserDto userDto);

	User findByEmail(String email);

	List<UserDto> findAllUsers();
}
