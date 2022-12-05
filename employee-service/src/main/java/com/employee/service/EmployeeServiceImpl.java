package com.employee.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "employee saved successfully";
	}

	@Override
	public List<Employee> getallEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Updated employee details successfully";
	}

	@Override
	public String deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
		return "Deleted employee details successfully";
	}

	@Override
	public String deleteById(Integer empId) {
		employeeRepository.deleteById(empId);
		return "Deleted employee details successfully";
	}

	@Override
	public Employee fetchEmpDetails(Integer empId) {
		
		Optional<Employee> optEmployee = employeeRepository.findById(empId);
		
		if(optEmployee.isPresent()) {
			return optEmployee.get();
		}else {
			throw new NoResultException("Employee details not found");
		}
		
	}
	
}
