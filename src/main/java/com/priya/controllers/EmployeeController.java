package com.priya.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.priya.Exception.CustomException;
import com.priya.entities.Employee;
import com.priya.service.EmployeeService;

@RestController
public class EmployeeController {
	
	public  Logger log=LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;	

	@GetMapping("/api/employee/listemployees")
	public List<Employee> getEmployees() throws CustomException {
		//List<Employee> listEmployee = new ArrayList<Employee>();
		List<Employee> listEmployee = employeeService.getAllEmployees();
		if(listEmployee.size()==0) {
			log.error("Throwing Custom Exceptuion"); 
			throw new CustomException("Employee Not Found");
		}
		
		return listEmployee;
	}
	
	
	  
	  @PostMapping("/api/employee/saveEmployee")
	  public List<Employee>	  saveEmployee(@RequestBody Employee employee) throws CustomException {
	  if(employee.getId()>0) {
		  throw new  CustomException("Employee with id cannot be saved");
		  }else {
			  	  employeeService.save(employee); 
			  	  }
	  return getEmployees();
	  }
	 
	
	@DeleteMapping("/api/employee/deletEmployee")
	public List<Employee> deleteEmployee(@RequestParam(value="id",required=false) int id) throws CustomException{
		employeeService.deleteById(id);		 
		return getEmployees();
		
	}

	@PutMapping("/api/employee/updateEmployee")
	public List<Employee> updateEmployee(@RequestBody Employee employee) throws CustomException{
		if(employee.getId()!=0) {
		employeeService.save(employee);
		}
		return getEmployees();
	}
}
