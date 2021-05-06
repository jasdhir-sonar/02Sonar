package com.revature.sonar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	
	public String sayHi() {
		return "hello Again";
	}
	
	
}
