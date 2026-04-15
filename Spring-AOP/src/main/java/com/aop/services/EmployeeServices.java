package com.aop.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aop.entity.Employee;
import com.aop.repo.EmployeeRepository;

@Service
public class EmployeeServices {

	private EmployeeRepository empolyeeRepository;

	public EmployeeServices(EmployeeRepository empolyeeRepository) {
		this.empolyeeRepository = empolyeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return empolyeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		return empolyeeRepository.save(employee);
	}

	public Employee updateEmployee(Employee newEmp) {

		Employee exemp = empolyeeRepository.findById(newEmp.getId()).orElseThrow();

		exemp.setName(newEmp.getName());
		exemp.setRole(newEmp.getRole());
		exemp.setSalary(newEmp.getSalary());

		return empolyeeRepository.save(exemp);
	}

	public String deleteEmployee(long id) {
		Employee emp = empolyeeRepository.findById(id).orElseThrow();
		empolyeeRepository.delete(emp);
		return id + " --> Employee Deleted Successfully...";
	}

	public List<Employee> findByRole(String role) {
		return empolyeeRepository.findByRole(role);
	}
}
