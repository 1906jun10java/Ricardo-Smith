package com.revature.Week2.beans;

public class Employee {
	
	public Employee() {
		super();
	}
	
	private int empID;
	private String firstName;
	private String lastName;
	private int deptID;
	private double salary;
	private String empEmail;
	
	public Employee(int empID, String firstName, String lastName, int deptID, double salary, String empEmail) {
		super();
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptID = deptID;
		this.salary = salary;
		this.empEmail = empEmail;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
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

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", firstName=" + firstName + ", lastName=" + lastName + ", deptID=" + deptID
				+ ", salary=" + salary + ", empEmail=" + empEmail + "]";
	}
	
	
	
	

}
