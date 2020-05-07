package com.cg.service;

import com.cg.beans.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee e);
	public boolean deleteEmployee(int empId);
	public Employee updateEmployee(Employee e);
	public String checkRole(int empId);

}
