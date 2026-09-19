package com.tka;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IgUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ; 
	
	@Column(nullable = false)
	private String firstName; 
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(unique = true , nullable = false)
	private String email;
	
	@Column(unique = true, nullable = false)
	private String userId;
	
	@Column(unique = true, nullable = false)
	private String mobile;
	
	@Column(nullable = false)
	private String password;
	
	

}
