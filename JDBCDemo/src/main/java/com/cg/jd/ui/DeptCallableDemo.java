package com.cg.jd.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class DeptCallableDemo {
	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"root")) {
			CallableStatement cs = con.prepareCall("{? = call get_department_count()}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int output = cs.getInt(1);
			System.out.println("Total rows: " + output);

			cs.close();

		} catch (SQLException excep) {
			System.out.println(excep.getMessage());
		}

	}

}