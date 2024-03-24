package com.sathya.servlet;
import java.sql.*;
import java.util.*;
public class ProductDao1 {

	public int save(product product)
	{
       Connection connection=null;
       PreparedStatement preparedstatement=null;
       int res=0;
       try
       {
    	   connection=DBConnection.createconnection();
    	   preparedstatement=connection.prepareStatement("insert into product values(?,?,?,?,?,?,?,?)");
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
	public List<product> findAll() 
	{
		List<product> prd=new ArrayList<product>();
		try(Connection connection=DBConnection.createconnection();Statement statement=connection.createStatement())
				{
					ResultSet resultset=statement.executeQuery("select * from product");
					while(resultset.next())
					{
						product product=new product();
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