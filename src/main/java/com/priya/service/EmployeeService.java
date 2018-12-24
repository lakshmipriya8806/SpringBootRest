package com.priya.service;

import java.util.List;

import com.priya.entities.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	
	public Employee save(Employee employee);
}
