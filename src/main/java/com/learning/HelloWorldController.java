package com.learning;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@RequestMapping("/greet/{name}")
	public String greet(@PathVariable("name") String name) {
		System.out.println("request recieved");
		return "Welcome to Springboot " + name + " " + new Date();
	}

	//two perforn addition of two numbers
	@RequestMapping("/add/{one}/{two}")
	public String add(@PathVariable("one") Integer numberOne, @PathVariable("two") Integer numberTwo) {
		System.out.println("request recieved");
		return "Addition of  " + numberOne + " and " + numberTwo + " is: " + (numberOne + numberTwo);
	}
}
