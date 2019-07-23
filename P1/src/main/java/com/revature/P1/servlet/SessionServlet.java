package com.revature.P1.servlet;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.P1.beans.User;




public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       // I will return a JSON representation of the currently signed in user
		// for this JSESSIONID!
   
    public SessionServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// grabbing the current session, otherwise getting a null value
		HttpSession session = request.getSession(false);
		
		if(session != null /*&& session.getAttribute("userID") != null*/) {
				int userID = Integer.parseInt(session.getAttribute("userID").toString());
				int mgrID = Integer.parseInt(session.getAttribute("mgrID").toString());
				String firstname = session.getAttribute("firstName").toString();
				String lastname = session.getAttribute("lastName").toString();
				String username = session.getAttribute("username").toString();
				String email = session.getAttribute("email").toString();
				User u = new User(userID, mgrID, username, firstname, lastname, email);
				response.getWriter().write((new ObjectMapper()).writeValueAsString(u));
			
		}else {
			response.sendRedirect("login");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
