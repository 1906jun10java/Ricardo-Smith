package com.revature.P1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Reimbursement")
public class ReimbursementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
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
				doGet(request, response);
	}

}
