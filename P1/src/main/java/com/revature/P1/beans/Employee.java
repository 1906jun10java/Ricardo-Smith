package com.revature.P1.beans;

public class Employee {
	
	private int employeeID;
	private String employeeFirst;
	private String employeeLast;
	private int managerID;
	private String managerFirst;
	private String managerLast;
	
	
	public Employee() {
		super();
	}


	public Employee(int employeeID, String employeeFirst, String employeeLast, int managerID, String managerFirst,
			String managerLast) {
		super();
		this.employeeID = employeeID;
		this.employeeFirst = employeeFirst;
		this.employeeLast = employeeLast;
		this.managerID = managerID;
		this.managerFirst = managerFirst;
		this.managerLast = managerLast;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeFirst == null) ? 0 : employeeFirst.hashCode());
		result = prime * result + employeeID;
		result = prime * result + ((employeeLast == null) ? 0 : employeeLast.hashCode());
		result = prime * result + ((managerFirst == null) ? 0 : managerFirst.hashCode());
		result = prime * result + managerID;
		result = prime * result + ((managerLast == null) ? 0 : managerLast.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeFirst == null) {
			if (other.employeeFirst != null)
				return false;
		} else if (!employeeFirst.equals(other.employeeFirst))
			return false;
		if (employeeID != other.employeeID)
			return false;
		if (employeeLast == null) {
			if (other.employeeLast != null)
				return false;
		} else if (!employeeLast.equals(other.employeeLast))
			return false;
		if (managerFirst == null) {
			if (other.managerFirst != null)
				return false;
		} else if (!managerFirst.equals(other.managerFirst))
			return false;
		if (managerID != other.managerID)
			return false;
		if (managerLast == null) {
			if (other.managerLast != null)
				return false;
		} else if (!managerLast.equals(other.managerLast))
			return false;
		return true;
	}
	
	


	public int getEmployeeID() {
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


	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeFirst=" + employeeFirst + ", employeeLast="
				+ employeeLast + ", managerID=" + managerID + ", managerFirst=" + managerFirst + ", managerLast="
				+ managerLast + "]";
	}
	
	
	
	

}
