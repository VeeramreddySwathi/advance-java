package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class productDao {

	

		
			public int save(product product) throws SQLException  {
				
			Connection connection=null;
			PreparedStatement preparedstatement=null;
			int res=0;
			try
			{
				connection=Dbconnection.createConnection();
				preparedstatement=connection.prepareStatement("insert into product1 values(?,?,?,?,?,?,?,?)");
				preparedstatement.setString(1,product.getProId());
				preparedstatement.setString(2,product.getProName());
				preparedstatement.setDouble(3,product.getProPrice());
				preparedstatement.setString(4,product.getProBrand());
				preparedstatement.setString(5, product.getProMadeIn());
				preparedstatement.setDate(6, product.getProMfgDate());
				preparedstatement.setDate(7, product.getProExpDate());
				preparedstatement.setBinaryStream(8, product.getProImage());
				res=preparedstatement.executeUpdate();
				
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			finally {
				if (connection!=null) 
				connection.close();
				if (preparedstatement!=null)
					connection.close();
					
				}
			
			return res;
		}

			
			

	}


