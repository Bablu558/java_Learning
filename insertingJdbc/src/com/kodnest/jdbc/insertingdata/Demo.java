package com.kodnest.jdbc.insertingdata;

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
//		ResultSet rs = null;
		String dPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kodnest";
		String user ="root";
		String password = "@Bab1298Lu";
		String sql = "insert into employee values (?,?,?,?)";
		try {
			// step 1 loading 
			Class.forName(dPath);
			
			// step -2 establish the connection
			con = DriverManager.getConnection(url, user, password);
			
//			step 3 creating the statement medium
			
			ps=con.prepareStatement(sql);
			System.out.println("Enter id, name, gender adn salary");
			int id = scan.nextInt();
			String name = scan.next();
			String gender = scan.next();
			int salary = scan.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, gender);
			ps.setInt(4, salary);
			
//			step -4  excuting the query
			int nora = ps.executeUpdate();
			
			// step 5 displaying the result
			
			System.out.println(nora+ " rows inserted");
			
//			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
//			 closing the resource
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				if(scan!=null) scan.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
