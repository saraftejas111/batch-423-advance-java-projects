package com.std.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.std.entity.Student;
import com.std.repo.StdRepo;

@Service
public class StdService {

	private StdRepo sr;

	public StdService(StdRepo sr) {
		super();
		this.sr = sr;
	}

	public List<Student> showAllStudents() {
		return sr.findAll();
	}

	public String deleteByID(int id) {
		Student std = sr.findById(id).orElseThrow();
		sr.delete(std);
		return "Deleted Success";
	}

	public Student addstudent(Student std) {
		return sr.save(std);
	}

	public Student updateStudent(int id, Student newstd) {
		Student std = sr.findById(id).orElseThrow();

		newstd.setId(std.getId());

		return sr.save(newstd);

	}

}
