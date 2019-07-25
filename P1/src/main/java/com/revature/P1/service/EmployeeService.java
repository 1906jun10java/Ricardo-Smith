package com.revature.P1.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.P1.beans.User;
import com.revature.P1.daoimpl.UserDAOImpl;

public class EmployeeService {
	
	EmployeeService(){
		
	}
	
	UserDAOImpl usd = new UserDAOImpl();
	public List<User> employeeList() {
		
		List<User> employees = new ArrayList<User>();
		
		try { 
			employees = usd.getEmployeeList();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	
	

}
