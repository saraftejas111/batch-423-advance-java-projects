package com.mvc.controller;

import com.mvc.services.EmployeeService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.entity.Employee;

@Controller
public class EmployeeController {

	private final EmployeeService employeeService;

	EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/first")
	public String myFirstMVCAPI() {
		return "Hello"; //
	}

	@GetMapping("/showname")
	public String showNameOfUser(Model m) {

		String myName = "Tejas TKA";

		m.addAttribute("user", myName);

		return "show"; //
	}

	@GetMapping("/savestudent")
	public String showNameOfStudent(@RequestParam("stdname") String stdname, Model m) {

		System.out.println("data from JSP : " + stdname);
		m.addAttribute("std", stdname);

		return "showstudent"; //
	}

	@PostMapping("addemployee")
	public String addEmployee(@ModelAttribute Employee employee, Model m) {

		System.out.println(employee);

		Employee dbemp = employeeService.addEmployee(employee);

		if (dbemp != null) {

			m.addAttribute("msg", dbemp.getName() + " Employee Added Successfully..");

		} else {
			m.addAttribute("msg", "Failed to Add Employee " + dbemp.getName());

		}

		return "employeeForm";
	}

	@GetMapping("allemp")
	public String findAllEmployees(Model m) {
		
		List<Employee> empList = employeeService.findAllEmployees();
		
		m.addAttribute("empList", empList);
		
		return "showAllEmployees";
	}

}
