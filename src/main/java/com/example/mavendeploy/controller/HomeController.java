package com.example.mavendeploy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${test.value.greeting}")
	private String greeting;

	@GetMapping("/")
	public Object index() {
		return greeting;
	}

}
