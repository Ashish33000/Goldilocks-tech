package com.example.demo.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	
	@GetMapping("/test")
	public String getDetails() {
		return "Hello world";
	}

}
