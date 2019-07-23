package com.revature.P1.service;

import java.sql.SQLException; 

import org.apache.log4j.Logger;

import com.revature.P1.beans.Credentials;
import com.revature.P1.beans.User;
import com.revature.P1.daoimpl.UserDAOImpl;

public class AuthenticationService {
	
	private static Logger log = Logger.getRootLogger();
	
	public AuthenticationService() {
		//no arg construcor!
	}
	
	
	UserDAOImpl usd = new UserDAOImpl();
	boolean valid;
	
	public User authentication(Credentials creds) {
		
		String username = creds.getUsername();
		System.out.println("AS username populated "+ username);
		log.info("username populated: " + username);
		
		String password = creds.getPassword();
		System.out.println("AS password populated " + password);
		log.info("password populated: ");
		
		User u = null;
	
		
		try {
			u = usd.getThisUser(username, password);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}

}
