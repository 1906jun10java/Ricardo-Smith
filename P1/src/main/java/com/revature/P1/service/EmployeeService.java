package com.revature.P1.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.P1.beans.User;
import com.revature.P1.daoimpl.ReimbursementDAOImpl;
import com.revature.P1.daoimpl.UserDAOImpl;

public class EmployeeService {
	
	public EmployeeService(){
		super();
	}
	
	UserDAOImpl usd = new UserDAOImpl();
	ReimbursementDAOImpl rdi = new ReimbursementDAOImpl();
	
	
	//======================================================
	
	public List<User> employeeList() {
		
		List<User> employees = new ArrayList<User>();
		
		try { 
			employees = usd.getEmployeeList();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	//========================================================
	
	public void createReimbursement(int reimbursementID, double amount, String description, String status, int empID, int reviewingMgrID) {
		
		try {
			rdi.createRequest(reimbursementID, amount, description, status, empID, reviewingMgrID);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//===============================================
	
	public void updateUsername(String username, int userID) {
		try {
			usd.updateUsername(username, userID);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
