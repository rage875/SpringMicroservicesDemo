package com.microservice.demo.AppUsersService.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class CreateUserRequestModel {
	@NotBlank(message = "FirtName is mandatory")
	@NotNull(message = "FirtName cannot be null")
	@Size(min=2, message = "FirtName cannot be less than 2 characters")
	private String firstName;
	@NotBlank(message = "LastName is mandatory")
	@NotNull(message = "LastName cannot be null")
	@Size(min=2, message = "LastName cannot be less than 2 characters")
	private String lastName;
	@NotBlank(message = "Email is mandatory")
	@NotNull(message = "Email cannot be null")
	@Email
	private String email;
	@NotBlank(message = "Password is mandatory")
	@NotNull(message = "Password cannot be null")
	@Size(min=8, max=16, message = "Password cannot be less than 8 and greater than 16 characters")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
