package com.microservice.demo.AppUsersService.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.demo.AppUsersService.data.UserEntity;
import com.microservice.demo.AppUsersService.data.UsersRepository;
import com.microservice.demo.AppUsersService.shared.UserDto;

@Service
public class UsersServiceImp implements UsersService {

	UsersRepository usersRepository;
	
	@Autowired
	public UsersServiceImp(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public UserDto createUser(UserDto userDetails) {
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity = modelMapper.map(userDetails, UserEntity.class);
		userEntity.setEncryptedPassword("test");

		usersRepository.save(userEntity);

		return modelMapper.map(userEntity, UserDto.class);
	}
}
