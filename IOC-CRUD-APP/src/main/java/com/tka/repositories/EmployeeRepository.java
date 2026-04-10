package com.tka.repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private SessionFactory sf;

	public long addEmployee(Employee emp) {

		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		long id = (long) s.save(emp); // object id

		return id;
	}

	public List<Employee> getAllEmployees() {

		try (Session s = sf.openSession()) {

			return s.createCriteria(Employee.class).list();
		}

	}

	public long updateEmployee(Employee newEmp) {

		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		Employee exemp = s.get(Employee.class, newEmp.getId());

		exemp.setName(newEmp.getName());
		exemp.setRole(newEmp.getRole());
		exemp.setSalary(newEmp.getSalary());
		
		long update = (long) s.save(exemp);

		tr.commit();
		s.close();

		return update;
	}
	
	

}
