package com.secured.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("first")
	public String securedAPI() {
		return "Welcome to Secured App";
	}

	@GetMapping("second")
	public String securedAPI2() {
		return "Welcome to Secured App 2";
	}
}