package com.sathya.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swathi","chinnu");
		// PreparedStatement preparedstatement=connection.prepareStatement("insert into emp values(111,'santhosh',218.0)");
		 PreparedStatement preparedstatement1=connection.prepareStatement("insert into emp values(112,'chinna',214.0)");
		//    int count=preparedstatement.executeUpdate();
		    int count1=preparedstatement1.executeUpdate();
		  // System.out.println("data inserted successfully"+count);
		   System.out.println("data inserted successfully"+count1);
			

	}

}
