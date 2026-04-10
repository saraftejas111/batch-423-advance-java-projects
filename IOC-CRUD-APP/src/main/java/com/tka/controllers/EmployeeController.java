package com.tka.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Employee;
import com.tka.services.EmployeeService;

@RestController
@RequestMapping("www.tcs.com")
public class EmployeeController {

	@Autowired
	private EmployeeService es;

	@PostMapping("/save")
	public String addEmployee(@RequestBody Employee emp) {

		long id = es.addEmployee(emp);

		if (id > 0) {

			return "employee added successfully at id : " + id;
		} else {
			return null;
		}
	}

	@GetMapping("/allemployees")
	public List<Employee> getAllEmployees() {
		return es.getAllEmployees();
	}

	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
		
		long id = es.updateEmployee(emp);

		if (id > 0) {

			return "employee updated successfully at id : " + id;
		} else {
			return null;
		}
	}

}
