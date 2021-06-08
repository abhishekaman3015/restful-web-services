package com.todoapp.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	

	//method -- "helloworld"
	@GetMapping(path="/hello")
	public String helloWorld() {
		return "Hello World";
	}

	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
}
