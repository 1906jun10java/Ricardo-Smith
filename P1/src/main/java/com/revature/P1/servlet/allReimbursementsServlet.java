package com.revature.P1.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.beans.Reimbursement;
import com.revature.P1.service.EmployeeService;

/**
 * Servlet implementation class allReimbursementsServlet
 */
@WebServlet("/allReimbursementsServlet")
public class allReimbursementsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService es = new EmployeeService();
 
    
    public allReimbursementsServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Reimbursement> reim = new ArrayList<Reimbursement>();
		reim = es.allReimbursements();
		
		response.getWriter().write((new ObjectMapper()).writeValueAsString(reim));
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
