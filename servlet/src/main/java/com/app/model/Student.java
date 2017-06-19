package com.app.model;

public class Student {
	private final String _name;
	private final String _lastName;
	
	public Student(final String name, final String lastName) {
		_name = name;
		_lastName = lastName;
	}
	
	public String name() {
		return _name;
	}
	
	public String lastName() {
		return _lastName;
	}
		
}
