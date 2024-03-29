package com.revature.P1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.P1.service.EmployeeService;


//@WebServlet("/ChangeUsernameServlet")
public class ChangeUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService es = new EmployeeService();
       
   
    public ChangeUsernameServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String username = request.getParameter("username");
		int userID = Integer.parseInt(session.getAttribute("userID").toString());
		
		es.updateUsername(username, userID);
		
		request.getRequestDispatcher("employeeProfile.html").forward(request, response);
				
	}

}
