package com.microservice.demo.AppUsersService.service;

import com.microservice.demo.AppUsersService.shared.UserDto;

public interface UserService {
	UserDto createUser(UserDto userDetails);
}
