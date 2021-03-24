package com.microservice.demo.AppUsersService.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.microservice.demo.AppUsersService.shared.UserDto;

public interface UsersService  extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
}
