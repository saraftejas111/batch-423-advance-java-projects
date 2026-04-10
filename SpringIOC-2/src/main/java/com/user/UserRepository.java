package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import notify.UserLogic;

@Repository
public class UserRepository {
	
	@Autowired
	protected UserLogic userLogic; 

}
