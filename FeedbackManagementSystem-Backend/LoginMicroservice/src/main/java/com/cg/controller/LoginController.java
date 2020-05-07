package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Employee;
import com.cg.beans.Login;
import com.cg.service.LoginServiceImpl;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginServiceImpl service;
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee validate(@RequestBody Login login) {
		Employee employee = service.validate(login);
		return employee;
	}

}
