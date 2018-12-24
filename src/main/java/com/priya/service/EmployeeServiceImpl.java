package com.priya.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priya.entities.Employee;
import com.priya.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll(); 
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeRepository.save(employee); 
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);
	}
}
