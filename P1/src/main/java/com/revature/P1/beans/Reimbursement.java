package com.revature.P1.beans;

public class Reimbursement {
	
	private int reimbursementID;
	private double amount;
	private String description;
	private String status;
	private int empID;
	private int reviewingMgrID;
	
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(int reimbursementID, double amount, String description, String status, int empID, int reviewingMgrID) {
		this.reimbursementID = reimbursementID;
		this.amount = amount;
		this.description = description;
		this.status = status;
		this.empID = empID;
		this.reviewingMgrID = reviewingMgrID;
	}

	public int getReimbursementID() {
		return reimbursementID;
	}
	public void setReimbursementID(int reimbursementID) {
		this.reimbursementID = reimbursementID;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getReviewingMgrID() {
		return reviewingMgrID;
	}

	public void setReviewingMgrID(int reviewingMgrID) {
		this.reviewingMgrID = reviewingMgrID;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementID=" + reimbursementID + ", amount=" + amount + ", description="
				+ description + ", status=" + status + ", empID=" + empID + ", reviewingMgrID=" + reviewingMgrID + "]";
	}
	
	
	

}
