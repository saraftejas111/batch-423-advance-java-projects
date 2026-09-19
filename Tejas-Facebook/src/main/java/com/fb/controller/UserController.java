package com.fb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fb.entity.LoginRequestDTO;
import com.fb.entity.User;
import com.fb.service.UserService;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {

	private final UserService userService;

	UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("save")
	public User saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@PostMapping("login")
	public User loginUser (@RequestBody LoginRequestDTO loginCred) {
		
		return userService.loginUser(loginCred) ; 
	}

}
