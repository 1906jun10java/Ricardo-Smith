package com.revature.P1.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.beans.Reimbursement;
import com.revature.P1.service.EmployeeService;


public class ReimbursementByUserIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService es = new EmployeeService();
 
    
    public ReimbursementByUserIDServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
HttpSession session = request.getSession();
		
		List<Reimbursement> reimbursementList = new ArrayList<Reimbursement>();
		int empID = Integer.parseInt(session.getAttribute("userID").toString());
		
		reimbursementList = es.reimbursementList(empID);
		
		response.getWriter().write((new ObjectMapper()).writeValueAsString(reimbursementList));	
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		
	}

}
