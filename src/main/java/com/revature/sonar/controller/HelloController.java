package com.revature.sonar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping("/hi")
	
	public String sayHi() {
		return "hello Again";
	}
	
	@RequestMapping("/hi1")
	
	public String sayAgain() {
		return "hello Again";
	}
}
