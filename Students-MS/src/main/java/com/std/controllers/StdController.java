package com.std.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.std.entity.Student;
import com.std.service.StdService;

@RestController
@CrossOrigin(origins = { "http://localhost:5173/" })
@RequestMapping("/api/students")
public class StdController {

	private StdService ss;

	public StdController(StdService ss) {
		super();
		this.ss = ss;
	}

	@GetMapping("/")
	public List<Student> showAllStudents() {
		return ss.showAllStudents();
	}

	@DeleteMapping("/{id}/")
	public String deleteByID(@PathVariable int id) {
		return ss.deleteByID(id);
	}

	@PostMapping("/")
	public Student addstudent(@RequestBody Student std) {
		System.out.println(std);
		return ss.addstudent(std);

	}

	@PutMapping("/{id}/")
	public Student updateStudent(@PathVariable int id, @RequestBody Student std) {
		System.out.println(std);
		return ss.updateStudent(id , std);

	}
}
