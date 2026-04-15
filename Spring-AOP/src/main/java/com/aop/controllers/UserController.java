package com.aop.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aop.entity.LoginCredentials;
import com.aop.entity.User;
import com.aop.services.UserServices;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {

	private UserServices userService ;

	public UserController(UserServices userService) {
		super();
		this.userService = userService;
	} 
	
	@PostMapping("add-user")
	public User addUser (@RequestBody User user) {
		return userService.addUser(user) ; 
	}
	
	@PostMapping("login")
	public User login(@RequestBody LoginCredentials logincred) {
		return userService.login(logincred) ; 
	}
	
	
}
