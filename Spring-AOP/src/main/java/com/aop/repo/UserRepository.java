package com.aop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User getByEmail(String email) ; 
}
