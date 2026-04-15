package com.aop.services;

import org.springframework.stereotype.Service;

import com.aop.entity.LoginCredentials;
import com.aop.entity.User;
import com.aop.repo.UserRepository;

@Service
public class UserServices {

	private UserRepository userRepo ;

	public UserServices(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	} 
	
	public User login(LoginCredentials logincred) {
		
		User user = userRepo.getByEmail(logincred.getEmail()); 
		
		if(user != null) {
			
			boolean flag  = user.getPassword().equals(logincred.getPassword()) ;
			
			if(flag) return user ; 
		}
		
		return null ; 
	}
	
	
	
}
