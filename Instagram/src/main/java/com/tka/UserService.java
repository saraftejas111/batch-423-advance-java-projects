package com.tka;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository ur;

	public UserService(UserRepository ur) {
		super();
		this.ur = ur;
	}

	public List<IgUser> getAllUsers() {
		return ur.findAll();
	}

	public IgUser getByFirstName(String fisrtName) {

		return ur.findByfirstName(fisrtName);
	}
}
