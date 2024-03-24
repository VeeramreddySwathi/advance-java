import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
public class ProcedureException {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","swathi","chinnu");
		
		//call the procedure
		
		CallableStatement callablestatement=connection.prepareCall("{call get sal(?,?)}");
		
		//set the input data
		
		callablestatement.setInt(1,1002);
		
		//register one variable to store the output
		
		callablestatement.registerOutParameter(2,Types.FLOAT);
	    
		//excute the procedure the output will be stored in registerd  in parameter
		
		callablestatement.executeUpdate();
		
		//print the output
		
		System.out.println(callablestatement.getFloat(2));

	}

}
