package com.priya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.entities.Employee;
import com.priya.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll(); 
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee); 
	}
}
