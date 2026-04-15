package com.aop.repo;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public String hello() {
		return "Hello Everyone...";
	}
}
