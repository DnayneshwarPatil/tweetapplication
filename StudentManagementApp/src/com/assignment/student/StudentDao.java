package com.assignment.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean addStudentToDb(Student st) {

		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query1 = "insert into students(sname, sphone, scity)" + "value(?,?,?)";
			PreparedStatement pr = con.prepareStatement(Query1);

			// value set to parameter
			pr.setString(1, st.getStudentName());
			pr.setString(2, st.getStudentPhone());
			pr.setString(3, st.getStudentCity());

			pr.executeUpdate();
			status = true;

		} catch (Exception e) {
		}
		return status;
	}

	public static boolean deleteStudentToDb(int studentId) {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query1 = "delete from students where sid =?";
			PreparedStatement pr = con.prepareStatement(Query1);

			// value set to parameter
			pr.setInt(1, studentId);

			pr.executeUpdate();
			status = true;

		} catch (Exception e) {
		}
		return status;
	}

	public static boolean getAllStudentData() {
		boolean status = false;
		try {

			Connection con = ConnectionProvider.createC();
			String Query1 = "select * from students";
			Statement st = con.createStatement();

			ResultSet set = st.executeQuery(Query1);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("sCity");

				System.out.println("ID:" + id);
				System.out.println("Name:" + name);
				System.out.println("Phone:" + phone);
				System.out.println("City:" + city);	
				System.out.println("............................................" );
			}

			// pr.executeUpdate();
			status = true;

		} catch (Exception e) {
		}
		return status;
	}
}
