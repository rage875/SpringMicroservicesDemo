package com.microservice.demo.AppUsersService.service;

import com.microservice.demo.AppUsersService.shared.UserDto;

public interface UsersService {
	UserDto createUser(UserDto userDetails);
}
