package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementInsertDemo {

	public static void main(String[] args) {
		
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				Scanner scan = new Scanner(System.in);) {
			
			con.setAutoCommit(false);
			
			System.out.println("Enter deptno : ");
			int deptno = scan.nextInt();
			System.out.println("Enter dname : ");
			String dname = scan.next();
			System.out.println("Enter location : ");
			String location = scan.next();
			
			String sql = "INSERT INTO departments (deptno, dname, location) VALUES(?,?,?)";
				
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3, location);
			
			System.out.println("Enter choice [Y/N] : ");
			String choice = scan.next();
			
			if (choice.equals("Y")) {
				ps.executeUpdate();
				System.out.println("Row inserted");
				con.commit();
			} else {
				con.rollback();
				System.out.println("Operation Cancelled");
			}
			ps.close();
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		} finally {
			
		}
	}

}
