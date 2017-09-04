package com.app.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.app.model.Course;
import com.app.validation.Rule;
import com.app.validation.ValidDateFormatRule;

public class SQLiteJDBC {
	
	private static SQLiteJDBC _instance = null;

	public static SQLiteJDBC getInstance() {
		if(_instance == null) {
			_instance = new SQLiteJDBC();
		}
		return _instance;
	}
	
	public void insert(Connection connection, Map<String, String> courseFields) {
		String query = "INSERT INTO Course VALUES(" + null + ", '"
													+ courseFields.get(Rule.COURSE_NAME) + "', '"
													+ courseFields.get(Rule.COURSE_DESCRIPTION) + "', '"
													+ courseFields.get(Rule.COURSE_LOCATION) + "', "
													+ courseFields.get(Rule.COURSE_SEATS) + ", '"
													+ courseFields.get(Rule.COURSE_START)
													+ "' )";
		try {
			Statement stm = connection.createStatement();
			stm.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public Course findById(Connection connection, int id) {
		String query = "select * from Course where id = " + id;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if ( rs.next() ) {
               return new Course(rs.getString("name"), 
                					   Integer.parseInt(rs.getString("id")), 
                					   rs.getString("description"), 
                					   rs.getString("location"), 
                					   ValidDateFormatRule.SDF.parse(rs.getString("start")), 
                					   Integer.parseInt(rs.getString("totalSeats")));
			}
			
		} catch (SQLException | NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Course> findAll(Connection connection) {	
		List<Course> courses = new ArrayList<>();		
		String query = "select * from Course order by id";
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			 while ( rs.next() ) {
	                courses.add(new Course(rs.getString("name"), 
	                					   Integer.parseInt(rs.getString("id")), 
	                					   rs.getString("description"), 
	                					   rs.getString("location"), 
	                					   ValidDateFormatRule.SDF.parse(rs.getString("start")), 
	                					   Integer.parseInt(rs.getString("totalSeats"))));
	         }
		} catch (SQLException | NumberFormatException | ParseException e) {
			throw new RuntimeException(e);
		}
		return courses;
	}
}
