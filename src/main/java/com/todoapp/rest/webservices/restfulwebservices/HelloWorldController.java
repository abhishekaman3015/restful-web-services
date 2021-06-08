package com.todoapp.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(path = "/hellobean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	} 

	@GetMapping(path = "/hellobean/pathvariable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello , %s", name));
	} 
}
