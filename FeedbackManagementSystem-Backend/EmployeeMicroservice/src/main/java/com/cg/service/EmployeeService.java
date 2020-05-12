package com.cg.service;

import java.util.List;

import com.cg.beans.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee e);
	public boolean deleteEmployee(int empId);
	public Employee updateEmployee(Employee e);
	public Employee checkRole(int empId);
	public List<Employee> getAllParticipant();

}
