package com.app.model;

public class Course {
	private final String _name;
	private final int _id;
	private final String _description;
	
	public Course(final String name, final int id, final String description) {
		_name = name;
		_id = id;
		_description = description;
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
}
