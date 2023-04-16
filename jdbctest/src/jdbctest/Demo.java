package jdbctest;
import java.sql.*;

public class Demo 
{
	public static void main(String[] args) throws Exception 
	{
		String dbUrl = "jdbc:mysql://localhost:3306/demo";
		String user = "student";		
		String pass = "student";
		
		int id= 14;
		String last_name = "Jony";
		String first_name = "Micheal";
		String email = "Mike.jony@foo.com";
		
		String sql = "insert into employees(id,last_name,first_name,email) "
				+ "values (?,?,?,?)";
		
		Connection con = DriverManager.getConnection(dbUrl,user,pass);
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, id);
		st.setString(2, last_name);
		st.setString(3, first_name);
		st.setString(4, email);
		


		int rs = st.executeUpdate();

		System.out.println(rs);	
		
		System.out.println(rs);	


		
		
		
		
	}
	

}
