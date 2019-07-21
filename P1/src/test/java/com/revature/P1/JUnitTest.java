package com.revature.P1;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.Test;

import com.revature.P1.daoimpl.UserDAOImpl;
import com.revature.P1.utilities.ConnFactory;

public class JUnitTest {
	public static ConnFactory conn = ConnFactory.getInstance();
	
	@Test
	public void testIsUser() throws SQLException{
		
		UserDAOImpl usd = new UserDAOImpl();		//creating a new instance of UserDAOImpl
		boolean test = usd.isUser("rick", "badman"); //testing my placeholder value using 'isUser' method,
		assertEquals(true, test);					//should return true!
	}

}
