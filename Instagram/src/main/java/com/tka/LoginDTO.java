package com.tka;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class LoginDTO {

	private String username;
	private String password;

	

}
