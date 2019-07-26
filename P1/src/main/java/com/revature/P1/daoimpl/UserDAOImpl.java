package com.revature.P1.daoimpl;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.P1.beans.User;
import com.revature.P1.dao.UserDAO;
import com.revature.P1.utilities.ConnFactory;

public class UserDAOImpl implements UserDAO{
	
	private boolean result;
	public static ConnFactory cf = ConnFactory.getInstance();

	//=================================================================================

	
	@Override
	public void createUser(int mgrID, String username, String password, String firstName, String lastName,String email) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO USERS VALUES(USRSEQ.NEXTVAL,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, mgrID);
		ps.setString(2, username);
		ps.setString(3, password);
		ps.setString(4, firstName);
		ps.setString(5, lastName);
		ps.setString(6, email);
		ps.executeUpdate();
	}
	
	//=================================================================================


	@Override
	public List<User> getUserList() throws SQLException {  //won't need this method. Just testing it
		
		List<User> userList = new ArrayList<User>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
		User u = null;
		while(rs.next()) {
			u = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			userList.add(u);
		}
		
		return userList;
	}
	
	//=================================================================================

	
	public User getThisUser(String username, String password) throws SQLException{
	//List<User> userList = new ArrayList<User>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE USERNAME = '"+username+"' AND PASSWORD = '"+password+"'" );
		User u = null;
		while(rs.next()) {
			u = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			
		}
		return u;
	}
	
	//=================================================================================

	
	
	public boolean isUser(String username, String password) throws SQLException{
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE USERNAME = '"+username+"' AND PASSWORD = '"+password+"'" );
		User u = null;
		while(rs.next()) {
			u = new User (rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	
	//=================================================================================

	
	// Use this method to get all employees!!!!
	
	public List<User> getEmployeeList() throws SQLException {  //won't need this method. Just testing it
		
		List<User> userList = new ArrayList<User>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM USERS WHERE MGRID != 1");
		User u = null;
		while(rs.next()) {
			u = new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			userList.add(u);
		}
		
		return userList;
	}
	
	//=================================================================================

	
	public void updateUsername (String username, int userID) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "UPDATE USERS SET USERNAME = ? WHERE USERID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ps.setInt(2, userID);
		ps.executeUpdate();
	}
	
	//=================================================================================

	
	
	public void updatePassword (String password, int userID) throws SQLException{
		Connection conn = cf.getConnection();
		String sql = "UPDATE USERS SET PASSWORD = ? WHERE USERID = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, password);
		ps.setInt(2, userID);
		ps.executeUpdate();
	}
	
	//=================================================================================


	

	
	
	

}
