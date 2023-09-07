package com.gold.entity;

import lombok.Data;

@Data
public class Test {
	private String name;
	private int age;
	public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
