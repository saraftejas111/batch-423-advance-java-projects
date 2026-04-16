package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	
	@GetMapping("/first")
	public String myFirstMVCAPI() {
		return "Hello" ;   // 
	}
	
	@GetMapping("/showname")
	public String showNameOfUser(Model m) {
		
		String myName = "Tejas TKA" ; 
		
		m.addAttribute("user" , myName) ; 
		
		return "show" ;   // 
	}
	
	@GetMapping("/savestudent")
	public String showNameOfStudent(@RequestParam("stdname") String stdname ,   Model m) {

		m.addAttribute("std" , stdname) ; 
		
		return "showstudent" ;   // 
	}
}
