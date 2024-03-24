import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
public class ProcedureException1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost 1521:xe","swathi","chinnu");
		
	CallableStatement callablestatement=connection.prepareCall("{call getdetails(?,?,?)");
	callablestatement.registerOutParameter(2, Types.INTEGER);
	callablestatement.registerOutParameter(3, Types.VARCHAR);
	callablestatement.registerOutParameter(4, Types.FLOAT);
	
	callablestatement.executeLargeUpdate();

	System.out.println(callablestatement.getInt(2));
	System.out.println(callablestatement.getInt(3));
	System.out.println(callablestatement.getInt(4));
	
	
	}

}
