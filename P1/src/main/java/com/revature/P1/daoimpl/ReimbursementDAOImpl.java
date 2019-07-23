package com.revature.P1.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.P1.beans.Reimbursement;
import com.revature.P1.beans.User;
import com.revature.P1.dao.ReimbursementDAO;
import com.revature.P1.utilities.ConnFactory;

public class ReimbursementDAOImpl implements ReimbursementDAO {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createRequest(double amount, String description, String status, int empID, int reviewingMgrID) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO REIMBURSEMENT VALUES(REIMBURSEMENTSEQ.NEXTVALUE,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setDouble(1, amount);
		ps.setString(2, description);
		ps.setString(3, status);
		ps.setInt(4, empID);
		ps.setInt(5, reviewingMgrID);
		ps.executeUpdate();
		
	}

	@Override
	public List<Reimbursement> getReimbursementByEmp(int empID) throws SQLException {
		List<Reimbursement> reimbursementList = new ArrayList<Reimbursement>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REIMBURSEMENT WHERE EMPID = '"+empID+"'");
		Reimbursement r = null;
		while(rs.next()) {
			r = new Reimbursement(rs.getInt(1), rs.getDouble(2),rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
			reimbursementList.add(r);
		}
		return reimbursementList;
	}

	@Override
	public List<Reimbursement> getReimbursementByMgr(int mgrID) throws SQLException {
		List<Reimbursement> reimbursementList = new ArrayList<Reimbursement>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM REIMBURSEMENT WHERE MGRID = '"+mgrID+"'");
		Reimbursement r = null;
		while(rs.next()) {
			r = new Reimbursement(rs.getInt(1), rs.getDouble(2),rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
			reimbursementList.add(r);
		}
		return reimbursementList;
	}
	
	
	 public void rejectSingleRequest(int userID, int reimbursementID) throws SQLException{
	
}
	
	
	
	

}
  