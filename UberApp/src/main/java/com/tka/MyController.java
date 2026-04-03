package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("www.uber.com")
public class MyController {

	@GetMapping("/hello")
	public String hello() {

		System.out.println("hello method is invoked...");

		return "Welcome to my first RestAPI";
	}

	@GetMapping("/booking")
	public String bookRide() {

		System.out.println("bookRide method is invoked...");
		
		String driver = "Jay Varma" ; 

		return "Cab is booked.."+driver+" is on the way..";
	}
}
