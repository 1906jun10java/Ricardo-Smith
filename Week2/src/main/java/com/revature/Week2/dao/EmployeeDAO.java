package com.revature.Week2.dao;
import java.sql.SQLException;
import java.util.List;

import com.revature.Week2.beans.Employee;

public interface EmployeeDAO {
	
	public abstract void createEmployee(String firstName, String lastName, int deptID, double salary, String empEmail) 
			throws SQLException;
	
	public abstract List<Employee> employeeList()
			throws SQLException;

}
