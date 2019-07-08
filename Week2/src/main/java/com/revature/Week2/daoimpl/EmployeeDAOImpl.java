package com.revature.Week2.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.Week2.beans.Employee;
import com.revature.Week2.dao.EmployeeDAO;
import com.revature.Week2.util.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static ConnFactory cf = ConnFactory.getInstance();

	public void createEmployee(String firstName, String lastName, int deptID, double salary, String empEmail)throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO EMPLOYEE VALUES(EMPLOYEESEQ.NEXTVAL,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setInt(3, deptID);
		ps.setDouble(4, salary);
		ps.setString(5, empEmail);
		ps.executeUpdate();	
	}
	
	
	

	public List<Employee> employeeList() throws SQLException {
	
		return null;
	}

}
