package com.tka.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.models.Employee;
import com.tka.services.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService es;

	public EmployeeController(EmployeeService es) {
		super();
		this.es = es;
	}

	@GetMapping("/showAll")
	public List<Employee> showAll() {
		return es.showAll();
	}

	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return es.saveEmployee(employee);
	}

	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable long id) {
		return es.deleteById(id);
	}

	@PutMapping("updateById/{id}")
	public Employee updateById(@PathVariable long id, @RequestBody Employee employee) {
		return es.updateById(id, employee);
	}
}
