package jdbctest;
import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcDemo {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		
		String dbUrl = "jdbc:mysql://localhost:3306/";
		String user = "student";		
		String pass = "student";

		try {
			// 1. Get a connection to database
			myConn = DriverManager.getConnection(dbUrl, user, pass);
			
			// 2. Create a statement
			//myStmt = myConn.createStatement();
			
			// 2. Prepare a statement
			myStmt = myConn.prepareStatement("select * from demo.employees where salary> ? and department = ?");
			
			//3. Set the parameters
			myStmt.setDouble(1,25000);
			myStmt.setString(2,"HR");
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery();
			

			while(myRs.next())
			{
				System.out.println(myRs.getString("salary") + " " + myRs.getString("department"));
			}
				
			
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}	
	}
	

}
