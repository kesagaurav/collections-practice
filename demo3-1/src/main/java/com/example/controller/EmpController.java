package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService service;
	@PostMapping("/employee")
	Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
	@GetMapping("/employees")
	List<Employee> getAllEmplpyees(){
		return service.getAllEmplpyees();
	}
}
