package com.revature.P1.beans;

public class User {
	
	private int userID;
	private int mgrID;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	
	public User() {
		super();
	}
	
	public User(int userID, int mgrID, String username, String password, String firstName, String lastName, String email) {
		this.userID = userID;
		this.mgrID = mgrID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public User(int userID, int mgrID, String username, String firstName, String lastName, String email) {
		this.userID = userID;
		this.mgrID = mgrID;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getUserID() {
		return userID;
	}
	public void setEmpID(int empID) {
		this.userID = userID;
	}

	public int getMgrID() {
		return mgrID;
	}
	public void setMgrID(int mgrID) {
		this.mgrID = mgrID;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\n"+"User [userID=" + userID + ", mgrID=" + mgrID + ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	

}
