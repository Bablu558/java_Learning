package com.kodnest.maventest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
class App 
{
    public static void main( String[] args )
    {
    	Connection con = null;
        PreparedStatement ps = null;
        Scanner scan = new Scanner(System.in);

        String dPath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/kodnest?user=root&password=@Bab1298Lu";
        String sql = "insert into maven values(?,?,?,?)";
        
        try {
        	Class.forName(dPath);
        	con= DriverManager.getConnection(url);
        	ps=con.prepareStatement(sql);
        	sharukh : while(true) {
        		System.out.println("Enter 1 to insert and 2 to exit");
        		int choice=scan.nextInt();
        		switch(choice) {
        		case 1:{
        			System.out.println("enter did, dname,dloc and noOfemp");
        			int id=scan.nextInt();
        			String name = scan.next();
        			String loc =scan.next();
        			int noe=scan.nextInt();
        			
        			ps.setInt(1, id);
        			ps.setString(2, name);
        			ps.setString(3, loc);
        			ps.setInt(4, noe);
        			
        			ps.addBatch();
        			break;
        		}
        		case 2:{
        			break sharukh;
        		}
        		}
        	}
        	int result[]=ps.executeBatch();
        	for(int i: result) {
        		System.out.print(i +" ");
        	}
        	System.out.println();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        finally {
        	try {
        		if(con!=null) con.close();
        		if(ps!=null) ps.close();
        		if(scan!=null) scan.close();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }
    }
}
