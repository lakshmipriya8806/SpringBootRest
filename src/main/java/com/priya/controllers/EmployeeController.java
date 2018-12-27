package com.priya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priya.entities.Employee;
import com.priya.Exception.CustomException;
import com.priya.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;	

	@GetMapping("/api/employee/listemployees")
	public List<Employee> getEmployees() {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		
		return listEmployee;
	}
	
	@PostMapping("/api/employee/saveEmployee")
	public List<Employee> saveEmployee(@RequestBody Employee employee) throws CustomException {
		if(employee.getId()>0) {
			throw new CustomException("Employee with id cannot be saved");
		}else {
		employeeService.save(employee);
		}
		return getEmployees(); 
	}
	
	@DeleteMapping("/api/employee/deletEmployee")
	public List<Employee> deleteEmployee(@RequestParam(value="id",required=false) int id){
		employeeService.deleteById(id);		 
		return getEmployees();
		
	}

	@PutMapping("/api/employee/updateEmployee")
	public List<Employee> updateEmployee(@RequestBody Employee employee){
		if(employee.getId()!=0) {
		employeeService.save(employee);
		}
		return getEmployees();
	}
}
