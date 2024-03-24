package com.satya.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;
public class DBconnection {

	public static Connection createConnection() throws SQLException
	{ 
		Connection connection=null;
		try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Swathi","chinnu");
			System.out.println("connection created successfullyy....");
			
		}
catch(ClassNotFoundException | SQLException ae)
		{
	   ae.printStackTrace();
		}
		finally
		{
			if(connection!=null)
				connection.close();
			
		}
		return connection;
	}
	
}
