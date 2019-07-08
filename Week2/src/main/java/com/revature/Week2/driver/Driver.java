package com.revature.Week2.driver;

import java.sql.SQLException;

import com.revature.Week2.daoimpl.DepartmentDAOImpl;
import com.revature.Week2.daoimpl.EmployeeDAOImpl;

public class Driver {
	
	public static void main(String []args) {
		
			EmployeeDAOImpl edi = new EmployeeDAOImpl();
			DepartmentDAOImpl ddi = new DepartmentDAOImpl();
			
			
			// function to create employee
			try {
				edi.createEmployee("Johnny", "Bravo", 1, 87000, "jbravo@gmail.com");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			// function to create a department
			try {
				ddi.createDepartmetn("RESEARCH & DESIGN");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	
		
	}

}
