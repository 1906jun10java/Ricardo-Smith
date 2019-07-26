package com.revature.P1.servlet;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.service.EmployeeService;

//@WebServlet("/EmpProfileServlet")
public class ManagerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService employeeService;
	private ObjectMapper objectMapper;
    
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("managerProfile.html").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	}

}
