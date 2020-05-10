package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Employee;
import com.cg.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao eDao;

	@Override
	public Employee addEmployee(Employee e) {
		Employee employee = eDao.save(e);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		eDao.deleteById(empId);
		return true;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		eDao.deleteById(e.getEmployeeId());
		Employee employee = eDao.save(e);
		return employee;
	}

	@Override
	public Employee checkRole(int empId) {
		Employee employee = eDao.findById(empId).get();
		return employee;
	}

}
