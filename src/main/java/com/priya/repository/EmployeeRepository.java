package com.priya.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.priya.entities.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
    List<Employee> findAll();
    
    Employee save(Employee employee); 

}