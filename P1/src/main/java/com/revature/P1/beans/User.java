package com.revature.P1.beans;

public class User {
	
	private int userID;
	private int mgrID;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	/*private int employeeID;
	private String employeeFirst;
	private String employeeLast;
	private int managerID;
	private String managerFirst;
	private String managerLast;*/
	
	public User() {
		super();
	}
	
	/*public User(int employeeID, String employeeFirst, String employeeLast, int managerID, String managerFirst, String managerLast) {
		this.employeeID = employeeID;
		this.employeeFirst = employeeFirst;
		this.employeeLast = employeeLast;
		this.managerID = managerID;
		this.managerFirst = managerFirst;
		this.managerLast = managerLast;
	}*/
	
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

	
	/*public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeFirst() {
		return employeeFirst;
	}

	public void setEmployeeFirst(String employeeFirst) {
		this.employeeFirst = employeeFirst;
	}

	public String getEmployeeLast() {
		return employeeLast;
	}

	public void setEmployeeLast(String employeeLast) {
		this.employeeLast = employeeLast;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getManagerFirst() {
		return managerFirst;
	}

	public void setManagerFirst(String managerFirst) {
		this.managerFirst = managerFirst;
	}

	public String getManagerLast() {
		return managerLast;
	}

	public void setManagerLast(String managerLast) {
		this.managerLast = managerLast;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
*/
	/*public String toString2() {
		return "User [userID=" + userID + ", mgrID=" + mgrID + ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", employeeID="
				+ employeeID + ", employeeFirst=" + employeeFirst + ", employeeLast=" + employeeLast + ", managerID="
				+ managerID + ", managerFirst=" + managerFirst + ", managerLast=" + managerLast + "]";
	}*/
	
	public String toString() {
		return "\n"+"User [userID=" + userID + ", mgrID=" + mgrID + ", username=" + username + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
		
	

}
