package com.tka;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserService us;

	public UserController(UserService us) {
		super();
		this.us = us;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Welcome to Instagram";
	}

	@GetMapping("/findAllUsers")
	public List<IgUser> getAllUsers() {
		return us.getAllUsers();
	}

	@GetMapping("getByfisrtName/{fisrtName}")
	public IgUser getByFirstName(@PathVariable String fisrtName) {
		return us.getByFirstName(fisrtName);
	}

	// DTO - Data Transfering Object

	@GetMapping("/login")
	public String loginCred(@RequestBody LoginDTO loginDetails) {
		return us.loginCred(loginDetails);
	}

}
