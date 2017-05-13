package model;

public class Student {
	private String _name;
	private String _lastName;
	
	public Student(final String name, final String lastName) {
		_name = name;
		_lastName = lastName;
	}
	
	public String getName() {
		return _name;
	}
	
	public String getLastName() {
		return _lastName;
	}
		
}
