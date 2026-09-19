package com.fb.service;

import com.fb.entity.LoginRequestDTO;
import com.fb.entity.User;
import com.fb.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository userRepository;

	UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User loginUser(LoginRequestDTO loginCred) {

		User u = userRepository.findByEmail(loginCred.getEmail());

		return u;
	}

}
