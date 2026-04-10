package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocCrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocCrudAppApplication.class, args);
		
		System.err.println("Application started successfully!");
		
		
	}

}
