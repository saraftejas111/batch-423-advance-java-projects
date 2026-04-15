package com.aop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.services.MyServices;

@RestController
public class MyController {

	@Autowired
	private MyServices ms;

	@GetMapping("hello-api")
	public String hello() {

		return ms.hello();
	}

	@GetMapping("hello2")
	public String hello2() {
		return ms.helloAOP();
	}

	@GetMapping("hello3")
	public String hello3() {

		return ms.hello();
	}
}
