package com.app.model;

public class Course {
	private final String _name;
	private final int _number;
	private final String _description;
	
	public Course(final String name, final int number, final String description) {
		_name = name;
		_number = number;
		_description = description;
	}

	public String name() {
		return _name;
	}

	public int number() {
		return _number;
	}

	public String description() {
		return _description;
	}	
}
