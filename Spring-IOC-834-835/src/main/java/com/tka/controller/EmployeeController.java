package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.abc.EmployeeCar;
import com.tka.EmployeeApps;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeCar car ; 
	
	@Autowired
//	@Qualifier("employeeGames")
	EmployeeApps employeeApps ; 
	
	
	@Autowired
	@Qualifier("employeeYoutube")
	EmployeeApps employeeAppss ; 
	
	
}
