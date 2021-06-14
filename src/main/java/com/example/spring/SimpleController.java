package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/")
	public String greet() {
		return "Hello, welcome to spring app -2.0";
	}

}
