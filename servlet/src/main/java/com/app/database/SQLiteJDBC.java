package com.app.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.model.Course;

public class SQLiteJDBC {
	
	private static SQLiteJDBC _instance = null;

	public static SQLiteJDBC getInstance() {
		if(_instance == null) {
			_instance = new SQLiteJDBC();
		}
		return _instance;
	}
	
	public void insert(Connection connection, Course course) {
		String query = "INSERT INTO Course VALUES(" + null + ", '"
													+ course.name() + "', '"
													+ course.description() + "', '"
													+ course.location() + "', "
													+ course.seatsLeft() + ", "
													+ course.date()
													+ " )";
		try {
			Statement stm = connection.createStatement();
			int result = stm.executeUpdate(query);
			System.out.println("Inserito: " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
