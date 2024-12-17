package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository erep;
	
	public Employee addEmployee(Employee e) {
		return erep.save(e);
	}
	
	public List<Employee> getAllEmplpyees(){
		return erep.findAll();
	}
	
	
}
