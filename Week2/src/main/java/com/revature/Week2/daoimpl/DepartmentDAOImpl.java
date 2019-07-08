package com.revature.Week2.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Week2.beans.Department;
import com.revature.Week2.beans.Employee;
import com.revature.Week2.dao.DepartmentDAO;
import com.revature.Week2.util.ConnFactory;

public class DepartmentDAOImpl implements DepartmentDAO{
	public static ConnFactory cf = ConnFactory.getInstance();
			
		 //this line needs to move down after the
						//query is executed

	public void createDepartmetn(String deptName) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO DEPARTMENT VALUES(DEPARTMENTSEQ.NEXTVAL,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, deptName);
		ps.executeUpdate();
		
	}

	public List<Department> departmentList() throws SQLException {
		List<Department> deptList = new ArrayList<Department>();
		Connection conn = cf.getConnection();
		String sql = "";
		
		return deptList; //this line needs to move down after the
						//query is executed
	}
	
	
	
	

}
