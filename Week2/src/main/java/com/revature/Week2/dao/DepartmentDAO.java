package com.revature.Week2.dao;
import java.sql.SQLException;
import java.util.List;

import com.revature.Week2.beans.Department;
import com.revature.Week2.beans.Employee;

public interface DepartmentDAO {
	
	public abstract void createDepartmetn(String deptName) 
			throws SQLException;
	
	public abstract List<Department> departmentList()
			throws SQLException;

}
