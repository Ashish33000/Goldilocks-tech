package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Test;
import com.example.demo.repo.TestRepo;

@Service
public class TestService {
	@Autowired
	private TestRepo ts;
	
	public List<Test> getAll(){
		List<Test> res=ts.findAll();
		return res;
	}

}
