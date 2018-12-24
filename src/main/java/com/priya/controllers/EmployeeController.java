package com.priya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priya.entities.Employee;
import com.priya.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;	

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		
		return listEmployee;
	}
	
	@PostMapping("/saveEmployee")
	public List<Employee> saveEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return getEmployees(); 
	}

}
