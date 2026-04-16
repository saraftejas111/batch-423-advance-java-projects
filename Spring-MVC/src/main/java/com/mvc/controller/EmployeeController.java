package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	
	@GetMapping("/first")
	public String myFirstMVCAPI() {
		return "Hello" ;   // 
	}
}
