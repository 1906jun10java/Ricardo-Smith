package com.revature.Week2.beans;

public class Department {
	
	public Department() {
		super();
	}
	
	private int deptID;
	private String deptName;
	
	public Department(int deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + "]";
	}
	
	
	
	
	

}
