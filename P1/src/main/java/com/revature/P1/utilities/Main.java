package com.revature.P1.utilities;

import java.sql.SQLException;
import org.apache.log4j.Logger;

import com.revature.P1.daoimpl.UserDAOImpl;

import org.apache.log4j.Logger;

public class Main {
	private static Logger log = Logger.getRootLogger();
	public static void main(String[] args) {
		
		UserDAOImpl usd = new UserDAOImpl();
		
	/*	try {
			log.info("Adding employee to the log");
			usd.createUser(100, "secretly", "spiderman", "Peter", "Parker", "Pete@dailyBugle.com");
		} catch (SQLException e) {
			e.printStackTrace();
		};*/
		
		System.out.println("Congratulations, an employee has been created!");
	//	log.info("Employee creation successful");
		System.out.println("finishing with program");
		
		try {
			System.out.println(usd.isUser("secretly", "spiderman"));
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
