package com.app.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.validation.ValidDateFormatRule;

public class Course {

	private final String _name;
	private final int _id;
	private final String _description;
	private final String _location;
	private final Date _date;
	private final int _seatsLeft;
	private final List<Student> _students = new ArrayList<>();
	
	public Course(final String name, final int id, final String description, final String location, final Date date, final int seatsLeft) {
		_name = name;
		_id = id;
		_description = description;
		_location = location;
		_date = date;
		_seatsLeft = seatsLeft;
	}
	
	public String name() {
		return _name;
	}

	public int id() {
		return _id;
	}

	public String description() {
		return _description;
	}	
	
	public String location() {
		return _location;
	}
	
	public Date date() {
		return _date;
	}
	
	public int seatsLeft() {
		return _seatsLeft;
	}
	
	public List<Student> studentList() {
		return _students;
	}
	
	public void enroll(Student student) {
		_students.add(student);
	}
	
	@Override
	public String toString() {
		return "Id: " + _id + ", Name: " + _name + ", Description: " +_description + ", Location: " + _location + ", Seats: " + _seatsLeft + ", Date: " + ValidDateFormatRule.SDF.format(_date);
	}
}
