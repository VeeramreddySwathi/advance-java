package jdbcex2;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao 
{
	public int save(EmployeeDao emp)
	 {
		    	Connection connection=null;
		    	PreparedStatement preparedstatement=null;
		    	int count=0;
		    	try
		    	{
		    	//get the connection
		    	connection =Dbconnection.createConnection();
		    	//create PS object
		    		preparedstatement=connection.prepareStatement("insert into emp1 values(?,?,?)");
		    	//read the data from emp object and set to parameters
		    		preparedstatement.setInt(1, emp.getempId());
		    		preparedstatement.setString(2,emp.getempName());
		    		preparedstatement.setDouble(3,emp.getempSalary());
		    		count=preparedstatement.executeUpdate();

		    	}
		    	catch(SQLException e)
		    	{
		    		e.printStackTrace();
		    	}
		    	finally
		    	{
		    		//before release connection check the connection is present or not
		    		if(connection!=null)
		    			connection.close();
		    		  if(preparedstatement!=null)
		    			  preparedstatement.close();
		    	}
		    	return count;
		    }
             
		 		public Employee findbyId(int empid)
		{
			Employee employee=null;
			try(Connection connection=Dbconnection.createconnection();PreparedStatement preparedstatement=connection.prepareStatement("select*from emp1 where empid=?"))
			
			{
				preparedstatement.setInt(1,empid); 
				ResultSet resultset=preparedstatement.executeQuery();
				 if(resultset.next())
				 {
					 employee=new Employee();
				     employee.setEmpid(resultset.getInt(1));
				     employee.setEmpname(resultset.getString(2));
				     employee.setEmpsalary(resultset.getDouble(3));	
			      }
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return employee;
		}
}
				