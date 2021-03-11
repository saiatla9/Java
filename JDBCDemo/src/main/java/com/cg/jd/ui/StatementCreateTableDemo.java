package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementCreateTableDemo {

	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				Scanner scan = new Scanner(System.in);) {
			
			String sql = "CREATE TABLE t4 (c1 int, c2 int, c3 int)";
			Statement st = con.createStatement();
			st.execute(sql);
			System.out.println("Table created");
			st.close();
		} catch(SQLException excep) {
			System.out.println(excep.getMessage());
		}
	}

}
