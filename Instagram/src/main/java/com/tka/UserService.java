package com.tka;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final LoginDTO loginDTO;

	private UserRepository ur;

	public UserService(UserRepository ur, LoginDTO loginDTO) {
		super();
		this.ur = ur;
		this.loginDTO = loginDTO;
	}

	public List<IgUser> getAllUsers() {
		return ur.findAll();
	}

	public IgUser getByFirstName(String fisrtName) {

		return ur.findByfirstName(fisrtName);
	}

	public String loginCred(LoginDTO loginCred) {

		List<IgUser> allusers = ur.findAll();

		for (IgUser igUser : allusers) {

			if (loginCred.getUsername().equalsIgnoreCase(igUser.getEmail()) ||

					loginCred.getUsername().equalsIgnoreCase(igUser.getMobile()) ||

					loginCred.getUsername().equalsIgnoreCase(igUser.getUserId())

			) {

				if (loginCred.getPassword().equals(igUser.getPassword())) {

					return "Login Success.. Welcome : " + igUser.getFirstName() + " " + igUser.getLastName();
				} else {
					return "Incorrect Password...";
				}
			}
		}

		return "User does not Exists...";

	}
}
