package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee employee);
	
	public List<Employee> getallEmployees();
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployee(Employee employee);
	
	public String deleteById(Integer empId);
	
	public Employee fetchEmpDetails(Integer empId);
}
