package com.example.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String greet() {
		return "Hello, welcome to spring app";
	}

}
