package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Test {
	private String name;
	private int age;

}
