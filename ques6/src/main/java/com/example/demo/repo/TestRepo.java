package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Test;

public interface TestRepo extends JpaRepository<Test, String> {

}
