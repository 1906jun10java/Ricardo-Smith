package com.revature.P1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.revature.P1.beans.Credentials;
import com.revature.P1.beans.User;
import com.revature.P1.daoimpl.UserDAOImpl;
import com.revature.P1.service.AuthenticationService;

public class LoginServlet extends HttpServlet {
	private static Logger log = Logger.getRootLogger();
	
	
	private AuthenticationService authenticationService = new AuthenticationService();
	
	
	//doGet method will handle all Get requests made to this servlet
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		log.info("LS. Inside of LonginServlet doGet method.");
		System.out.println("inside of loginservlet");
		req.getRequestDispatcher("Login.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		HttpSession session = req.getSession();
		System.out.println("attempting to populate creds");
		
		Credentials creds = new Credentials(req.getParameter("username"), req.getParameter("password"));
		System.out.println("LS. going to check if credentials are good");
		
		log.info("inside the LoginServlet doPost method");
		System.out.println("these are the creds: " +creds);
		
		User user = authenticationService.authentication(creds);
		
		if(user != null) {
			System.out.println("LS. user not null");
			log.info("the user input is valid and we have retrieved  their info");
			session.setAttribute("userID", user.getUserID());
			session.setAttribute("mgrID", user.getMgrID());
			session.setAttribute("username", user.getUsername());
			session.setAttribute("firstName", user.getFirstName());
			session.setAttribute("lastName", user.getLastName());
			session.setAttribute("email", user.getEmail());
			session.setAttribute("problem", null);
			
			resp.sendRedirect("profile");
		}else {
			System.out.println("user is null");
			session.setAttribute("problem", "you are no assassin");
			resp.sendRedirect("login");
		}
	}

}
