package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			
			{
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swathi","chinnu");
		    System.out.println("connection created succesfully");
			return;
		    
		     
			}
		}

	
	}
	


