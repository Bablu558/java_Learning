package thirdjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		Scanner scan = new Scanner(System.in);
		ResultSet rs = null;
		String dPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String user ="root";
		String password = "@Bab1298Lu";
		String sql = "select * from student where id = ?";
		
	try {
		
    	Class.forName(dPath);
    	con =DriverManager.getConnection(url, user, password);
   
    
    ps = con.prepareStatement(sql);
    System.out.println("Enter id to fetch data");
    
    int uid = scan.nextInt();
    ps.setInt(1, uid);
    
    rs=ps.executeQuery();
    if(rs.next()) {
    	System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getString(3));
    	
    }else {
    	System.out.println("Invalid id no user exit:" + uid);
    }
    
    } catch (Exception e) {
    	e.printStackTrace();
   }
	finally {
		try {
		if(con!=null) con.close();
		if(ps!=null) ps.close();
		if(rs!=null) rs.close();
		if(scan!=null) scan.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

}
