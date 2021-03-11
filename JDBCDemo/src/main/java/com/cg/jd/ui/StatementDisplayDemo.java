package com.cg.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDisplayDemo {
	public static void main(String[] args) {
		try (Connection con = 
				DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
				) {
			
			Statement st = con.createStatement();
			String sql = "SELECT * FROM departments";
			
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){ 
				do{
				System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));
				}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			con.close();
		}catch(SQLException excep) {
				System.out.println(excep.getMessage());
		}
	}
}
