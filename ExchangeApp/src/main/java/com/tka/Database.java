package com.tka;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
  public List<Employee> getAllEmployees () {
	  
  	Employee e1 = new Employee(101, "Raj Sharma", "Developer", 12345);
  	Employee e2 = new Employee(102, "Amit Verma", "Tester", 11000);
  	Employee e3 = new Employee(103, "Neha Singh", "HR", 15000);
  	Employee e4 = new Employee(104, "Priya Mehta", "Manager", 25000);
  	Employee e5 = new Employee(105, "Rohit Patil", "Developer", 14000);
  	Employee e6 = new Employee(106, "Sneha Joshi", "Designer", 13000);
  	Employee e7 = new Employee(107, "Karan Gupta", "Support", 10000);
  	Employee e8 = new Employee(108, "Anjali Desai", "Tester", 11500);
  	Employee e9 = new Employee(109, "Vikas Yadav", "Developer", 14500);
  	Employee e10 = new Employee(110, "Pooja Kulkarni", "HR", 15500); 
  	List<Employee> allemps = new ArrayList<>();	
  	allemps.add(e1);
		allemps.add(e2);
		allemps.add(e3);
		allemps.add(e4);
		allemps.add(e5);
		allemps.add(e6);
		allemps.add(e7);
		allemps.add(e8);
		allemps.add(e9);
		allemps.add(e10);
		
		return allemps ; 
  }

}
