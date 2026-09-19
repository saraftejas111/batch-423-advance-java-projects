package com.se;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/msg")
	public String hello() {
		return "Welcome to Secured App";
	}
}
