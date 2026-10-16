package com.std.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.std.entity.Student;

public interface StdRepo extends JpaRepository<Student, Integer> {

}
