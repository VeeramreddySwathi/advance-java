package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcex1 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1:Load the driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver Loaded Successfully...");
				
				//step2:create the connectionQW
				
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swathi","chinnu");
				System.out.println("connection created successfully.......!!");
				
				//step3:process the query execution
			
                
				Statement statement=connection.createStatement();				
				String q="create table emp(empid number,empname varchar2(30),empsalary number)";
				
				int res1=statement.executeUpdate(q);
				System.out.println("table created successfully...."+res1);
				
			//String q2="drop table emp";
			//int res2=statement.executeUpdate(q2);
			//System.out.println("table dropped successfullly...."+res2);
				
				//step4:Realese the connection
				
				//connection.close();
				//System.out.println("connection closed successfully.....");
				
				
				
				
				
			}

		
	}


