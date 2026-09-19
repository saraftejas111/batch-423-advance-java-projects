package com.mvc.services;

import com.mvc.repo.EmployeeRepository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvc.entity.Employee;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	public List<Employee> findAllEmployees() {

		return employeeRepository.findAll();

	}

}
