package com.revature.P1.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.P1.beans.Reimbursement;
import com.revature.P1.beans.User;

public interface ReimbursementDAO {
	
	public abstract void createRequest(double amount, String description, String status, int empID, int reviewingMgrID) 
			throws SQLException;
	
	public abstract List<Reimbursement> getReimbursementByEmp(int empID)
			throws SQLException;
	
	public abstract List<Reimbursement> getReimbursementByMgr(int mgrID)
			throws SQLException;
	
	

}
