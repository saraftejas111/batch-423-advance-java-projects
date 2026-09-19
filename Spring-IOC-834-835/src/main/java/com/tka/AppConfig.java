package com.tka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	
	@Bean
    @Primary
	EmployeeGames employeeGames() {
		return new EmployeeGames() ; 
	}
	
	@Bean
	EmployeeYoutube employeeYoutube() {
		return new EmployeeYoutube(); 
	}
	
}
