package com.tka.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tka.models.Employee;
import com.tka.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository er;

	public EmployeeService(EmployeeRepository er) {
		super();
		this.er = er;
	}

	public List<Employee> showAll() {

		return er.findAll();
	}

	public Employee saveEmployee(Employee employee) {

		return er.save(employee);
	}

	public String deleteById(long id) {

		Employee emp = er.findById(id).orElseThrow();

		er.delete(emp);

		return id + " Id Data is Deleted successfuly...";
	}

	public Employee updateById(long id, Employee newEmployee) {

		Employee exsistingEmployee = er.findById(id).orElseThrow();

		exsistingEmployee.setDepartment(newEmployee.getDepartment());
		exsistingEmployee.setEmail(newEmployee.getEmail());
		exsistingEmployee.setName(newEmployee.getName());
		exsistingEmployee.setSalary(newEmployee.getSalary());

		return er.save(exsistingEmployee);
	}
}
