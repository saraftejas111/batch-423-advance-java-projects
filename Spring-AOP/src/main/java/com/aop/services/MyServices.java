package com.aop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.repo.MyRepository;

@Service
public class MyServices {

	@Autowired
	private MyRepository mr;

	public String hello() {
		return mr.hello();
	}
	
	public String helloAOP() {
		return mr.hello();
	}
}
