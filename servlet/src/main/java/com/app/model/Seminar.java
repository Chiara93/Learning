package com.app.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seminar {
	private final Course _course;
	private final String _location;
	private final Date _date;
	private final int _seatsLeft;
	private final List<Student> _students = new ArrayList<Student>();
	
	public Seminar(final Course course, final String location, final Date date, final int seatsLeft) {
		_course = course;
		_location = location;
		_date = date;
		_seatsLeft = seatsLeft;
	}
	
	public Course course() {
		return _course;
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
}
