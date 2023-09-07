package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test;
import com.example.demo.service.TestService;

@RestController
public class Controller {
	
	@Autowired
	private TestService ts;
	@GetMapping("/test")
	public List<Test> getAll(){
		return ts.getAll();
	}

}
