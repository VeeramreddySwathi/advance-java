package jdbcex2;

import java.sql.SQLException;

public class DataBaseClient {

	public static void main(String[] args) throws SQLException {
		
		    EmployeeDao employeedao=new EmployeeDao();
		    
		   int res1=employeedao.save(new Employee(1001,"santhosh",118));
		   System.out.println("data inserted successfully...."+res1);
		   
		   int res2=employeedao.save(new Employee(1002,"hemanth",128));
		   System.out.println("data inserted successfully......"+res2);
		   
		     //read the data from database
		   
		  Employee emp=employeedao.findbyId(1001);
		  System.out.println(emp);
		  
		  int count=employeedao.deletedbyId(1001);
		  
		  if(count==1)
			  
			System.out.println("data deleted successfully.."+count);
		   else 
		    System.out.println("data deletion failed...");
		  
		    int count=employeedao.deletebySalary(128);
		     System.out.println("data deleted");
		    
				
			}

		
		
		
		
		
		
		
		
		
		
		
	}


