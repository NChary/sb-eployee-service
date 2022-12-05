package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	// Create an object of EmployeeServiceImpl
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome to Spring Boot RESTful Webservice";
	}

	@PostMapping("/employee")
	public String saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeService.getallEmployees();
	}
	
	@PutMapping("/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employee")
	public String deleteEmployee(@RequestBody Employee employee) {
		return employeeService.deleteEmployee(employee);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteById(@PathVariable Integer employeeId) {
		return employeeService.deleteById(employeeId);
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeDetails(@PathVariable Integer employeeId) {
		return employeeService.fetchEmpDetails(employeeId);
	}
	
}
