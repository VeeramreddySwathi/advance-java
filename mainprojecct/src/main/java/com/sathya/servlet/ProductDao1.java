package com.sathya.servlet;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao1 {

	
		public int save(Product product)
		{
	       Connection connection=null;
	       PreparedStatement preparedstatement=null;
	       int res=0;
	       try
	       {
	    	   connection=DBConnection.createconnection();
	    	   preparedstatement=connection.prepareStatement("insert into Product values(?,?,?,?,?,?,?,?)");
	    	   preparedstatement.setString(1,product.getPid());
	    	   preparedstatement.setString(2,product.getProname());
	    	   preparedstatement.setDouble(3,product.getProprice());
	    	   preparedstatement.setString(4,product.getProbrand());
	    	   preparedstatement.setString(5,product.getPromadein());
	    	   preparedstatement.setDate(6,product.getPromnfdate());
	    	   preparedstatement.setDate(7,product.getProexpdate());
	    	   preparedstatement.setBytes(8,product.getProImage());
	    	   res=preparedstatement.executeUpdate();
	    	   
	       }
	       catch(SQLException e)
	       {
	    	   e.printStackTrace();
	       }
	       finally
	       {
	    	   if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	   if(preparedstatement!=null)
				try {
					preparedstatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       }
		return res;
	       
		}
		public List<Product> findAll() 
		{
			List<Product> prd=new ArrayList<Product>();
			try(Connection connection=DBConnection.createconnection();Statement statement=connection.createStatement())
					{
						ResultSet resultset=statement.executeQuery("select * from Product");
						while(resultset.next())
						{
							Product product=new Product();
							product.setPid(resultset.getString(1));
							product.setProname(resultset.getString(2));
							product.setProprice(resultset.getDouble(3));
							product.setProbrand(resultset.getString(4));
							product.setPromadein(resultset.getString(5));
							product.setPromnfdate(resultset.getDate(6));
							product.setProexpdate(resultset.getDate(7));
							product.setProImage(resultset.getBytes(8));
							prd.add(product);
						}
					}
			     catch(SQLException s)
			{
			    	 s.printStackTrace();
			}
			return prd;
		}
	   
	}
	
	
	

