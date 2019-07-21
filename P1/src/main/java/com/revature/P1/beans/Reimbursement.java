package com.revature.P1.beans;

public class Reimbursement {
	
	private int reimbursementID;
	private double amount;
	private String description;
	private String status;
	
	
	public Reimbursement() {
		super();
	}
	
	public Reimbursement(int reimbursementID, double amount, String description, String status) {
		this.reimbursementID = reimbursementID;
		this.amount = amount;
		this.description = description;
		this.status = status;
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

	@Override
	public String toString() {
		return "\n"+"Reimbursement [reimbursementID=" + reimbursementID + ", amount=" + amount + ", description="
				+ description + ", status=" + status + "]";
	}
	
	
	

}
