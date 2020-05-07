package com.cg.service;

import com.cg.beans.Employee;
import com.cg.beans.Login;

public interface LoginService {
	
	public Employee validate(Login login);

}
