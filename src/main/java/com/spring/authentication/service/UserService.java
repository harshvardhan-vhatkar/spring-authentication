package com.spring.authentication.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.authentication.dto.UserRegistrationDto;
import com.spring.authentication.entity.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
