package com.kodnest.jdbc.delete;

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
		String url = "jdbc:mysql://localhost:3306/kodnest?user=root&password=@Bab1298Lu";
		
//		String sql = "Delete from employee where id = ?";
		String sql = "update employee set name =? where id = ?";
		
		try {
			Class.forName(dPath);
			con= DriverManager.getConnection(url);
			ps=con.prepareStatement(sql);
			System.out.println("Enter id to update the name of employee");
			
			int id =  scan.nextInt();
			System.out.println("Enter new name");
			String newName = scan.next();
			
			
//			ps.setInt(1, id);
		
			ps.setInt(2, id);
			ps.setString(1, newName);
			int nora = ps.executeUpdate();
		
//		System.out.println(nora+" row(s) Deleted");
		
			System.out.println(nora+" row(s) updated");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				if(scan!=null) scan.close();
			}catch(Exception e) {
				
			}
		}
	}

}


//Practice -1 , give user choice to change name or salary


