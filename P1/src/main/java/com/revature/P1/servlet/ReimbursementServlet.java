package com.revature.P1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.P1.service.EmployeeService;


//@WebServlet("/Reimbursement")
public class ReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService es = new EmployeeService();
       
    
    public ReimbursementServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double amount = Double.parseDouble(request.getParameter("amount"));
		String reason = request.getParameter("reason");
		
		PrintWriter out = response.getWriter();
		out.println("you have submitted a request for reimbursement of: "+amount+" for: "+reason);
		
	//	request.getDispatcherType("request");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				HttpSession session = request.getSession();
				
				double amount = Double.parseDouble(request.getParameter("amount"));
				String reason = request.getParameter("reason");
				
				int empID = Integer.parseInt(session.getAttribute("userID").toString());
				int mgrID = Integer.parseInt(session.getAttribute("mgrID").toString());
				
				es.createReimbursement(8, amount, reason, "Pending", empID, mgrID);
				
				request.getRequestDispatcher("employeeProfile.html").forward(request, response);
				
	}

}
