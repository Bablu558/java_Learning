package com.kodnest.jdbcproblems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter id, houseNo, streetname, city, state, country, pincode");
    	Address addr = new Address(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
    	
    	System.out.println("Enter student id, name, gender, age , college, university, thenthmarks, twelveth marks, degree aggregate");
    	Student stu =new Student(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), addr);
    System.out.println(stu);
    Connection con = null;
	PreparedStatement ps = null;
	PreparedStatement ps2 = null;
	
//	ResultSet rs = null;
	String dPath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/kodnest?user=root&password=@Bab1298Lu";
	
	String sql = "insert into student values (?,?,?,?,?,?,?,?,?,?)";
	
    String sql2 = "insert into address values(?,?,?,?,?,?,?)";
    
    
    try {
    	
    	Class.forName(dPath);
    	con = DriverManager.getConnection(url);
    	
    	ps = con.prepareStatement(sql);
    	ps2 = con.prepareStatement(sql2);
    	
    	// Asign the values to ps and ps2 placeholders
    	ps.setInt(1,stu.getId());
    	ps.setString(2, stu.getName());
    	ps.setString(3, stu.getGender());
    	ps.setInt(4, stu.getAge());
    	ps.setString(5, stu.getCollege());
    	ps.setString(6, stu.getUniversity());
    	ps.setInt(7, stu.getTenthmarks());
    	ps.setInt(8,stu.getTwelvethmarks());
    	ps.setInt(9, stu.getDegreeAggregate());
    	ps.setInt(10,stu.address.getId());
    	
    	// persist ps2 and then persist ps1
    	
    	ps2.setInt(1,addr.getId());
    	ps2.setInt(2, addr.getHouseNo());
    	ps2.setString(3,addr.getStreetname());

    	ps2.setString(4,addr.getCity());
    	ps2.setString(5,addr.getState());
    	ps2.setString(6,addr.getCountry());
    	ps2.setInt(7,addr.getPincode());
    	
    	int nora1 = ps2.executeUpdate();
    	int nora2 =ps.executeUpdate();
    	
    	System.out.println(nora1 + nora2 + " Row(s) affected");
    }catch (Exception e) {
    	e.printStackTrace();
    }
    finally {
    	try {
    		if(con!=null) con.close();
    		if(ps!=null) ps.close();
    		if(ps2!=null) ps2.close();
    		if(sc!=null) sc.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    
  }
    }
}
