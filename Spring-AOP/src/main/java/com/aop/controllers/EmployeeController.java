package com.aop.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aop.entity.Employee;
import com.aop.services.EmployeeServices;

@RestController
public class EmployeeController {

	private EmployeeServices employeeService;

	public EmployeeController(EmployeeServices employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("all-employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping("add-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("update-employee")
	public Employee updateEmployee(@RequestBody Employee newEmp) {
		return employeeService.updateEmployee(newEmp);
	}

	@DeleteMapping("delete-emp-by-id/{id}")
	public String deleteEmployee(@PathVariable long id) {
		return employeeService.deleteEmployee(id);
	}
	
	@GetMapping("employees-by-role")
	public List<Employee> findByRole(@RequestParam String role) {
		return employeeService.findByRole(role);
	}
}
