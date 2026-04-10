package com.tka;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:5173/")
public class MyController {

	// http req : GET, use SBOOT annotation : --> GetMapping("/url") { read only
	// operation }

	// http req : POST, use SBOOT annotation : --> PostMapping("/url") { insert or
	// save operation}

	// http req : PUT, use SBOOT annotation : --> PutMapping("/url") { update to
	// existing data }

	// http req : DELETE, use SBOOT annotation : --> DeleteMapping("/url") { delete
	// the existing record }

	// after hitting or running a RestAPI its result = method's return

	// if we return object to RestAPI --> result JSON { javascript object notation }

	String msg = "hello from MyController";

	Database d = new Database(); // old way to create object

	@GetMapping("msg-from-app") // url , RestAPI
	public String msgFromApp() {

		System.out.println("pratik");

		return msg;
	}

	@GetMapping("show-employee") // url , RestAPI

	public Employee showEmployee() {

		Employee e1 = new Employee(101, "Raj Sharma", "Developer", 12345);
		System.out.println(e1);

		return e1;
	}

	@GetMapping("all-employees")
	public List<Employee> showAllEmployees() {

		List<Employee> all = d.getAllEmployees();

		return all;

	}

	@GetMapping("get-employee-by-id/{id}")

	public String getEmployeeById(@PathVariable int id) {

		List<Employee> all = d.getAllEmployees();

		for (Employee e : all) {

			if (e.getId() == id) {

				return "employee found --> " + e;
			}
		}
		return "employee not found by id : " + id;

	}

	@GetMapping("sum/{num1}/{num2}")
	public String addition(@PathVariable int num1, @PathVariable int num2) {

		System.out.println("resut = " + (num1 + num2));

		return "SUM = " + (num1 + num2);

		// SUM = 15 ;
	}

	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee emp) {

		System.out.println("aya hua emp --> " + emp);

		Employee ee = emp;

		System.out.println("store kiya hua emp --> " + ee);

		return emp;

	}

	// http : GET , POST , PUT , DELETE { CRUD }
}
