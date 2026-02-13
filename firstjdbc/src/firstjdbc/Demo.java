package firstjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			// step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			
			// step 2 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest", "root", "@Bab1298Lu");
			
			System.out.println("Connection establish");
			
			
			// step 3
		Statement stmt =  con.createStatement();
			System.out.println("Statement medium created:");
			
    		// step 4 
			String sql = "Select * from student";
			
		ResultSet rs= stmt.executeQuery(sql);
			
		// step- 5
		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+(Integer.parseInt(rs.getString(3))+1));
			
		}
		
		// step 6
		
		con.close();
		stmt.close();
		rs.close();
		
		
		
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
