package com.kodnest.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement ps = null;
        Scanner scan = new Scanner(System.in);

        String dPath = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/kodnest";
        String user = "root";
        String password = "@Bab1298Lu";

        try {
            Class.forName(dPath);
            con = DriverManager.getConnection(url, user, password);

            System.out.println("Enter employee id:");
            int id = scan.nextInt();

            System.out.println("What do you want to update?");
            System.out.println("1. Name");
            System.out.println("2. Salary");
            int choice = scan.nextInt();

            if (choice == 1) {
                // 🔹 Update Name
                String sql = "update employee set name = ? where id = ?";
                ps = con.prepareStatement(sql);

                System.out.println("Enter new name:");
                String newName = scan.next();

                ps.setString(1, newName);
                ps.setInt(2, id);

            } else if (choice == 2) {
                // 🔹 Update Salary
                String sql = "update employee set salary = ? where id = ?";
                ps = con.prepareStatement(sql);

                System.out.println("Enter new salary:");
                int newSalary = scan.nextInt();

                ps.setInt(1, newSalary);
                ps.setInt(2, id);

            } else {
                System.out.println("Invalid choice");
                return;
            }

            int nora = ps.executeUpdate();
            System.out.println(nora + " row(s) updated");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
                if (scan != null) scan.close();
            } catch (Exception e) {
            }
        }
    }
}
