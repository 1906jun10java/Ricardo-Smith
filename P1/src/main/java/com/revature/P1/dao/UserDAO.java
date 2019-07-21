package com.revature.P1.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.P1.beans.User;

public interface UserDAO {
	
	public abstract void createUser(int mgrID, String username, String password, String firstName, String lastName, String email) 
			throws SQLException;
	
	public abstract List<User> getUserList()
			throws SQLException;
	
	

}
