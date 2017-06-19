package com.app.model;

public class Course {
	private final String _courseName;
	private final int _courseNumber;
	private final String _courseDescription;
	
	public Course(final String courseName, final int courseNumber, final String courseDescription) {
		_courseName = courseName;
		_courseNumber = courseNumber;
		_courseDescription = courseDescription;
	}

	public String name() {
		return _courseName;
	}

	public int number() {
		return _courseNumber;
	}

	public String description() {
		return _courseDescription;
	}	
}
