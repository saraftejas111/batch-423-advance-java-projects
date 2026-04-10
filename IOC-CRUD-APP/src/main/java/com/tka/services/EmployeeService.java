package com.tka.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.entity.Employee;
import com.tka.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository er;

	public long addEmployee(Employee emp) {

		return er.addEmployee(emp);

	}

	public List<Employee> getAllEmployees() {
		return er.getAllEmployees();
	}
	
	public long updateEmployee(Employee emp) {

		return er.updateEmployee(emp);

	}
}
