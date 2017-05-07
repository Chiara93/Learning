
public class Student {
	private String _name;
	private String _lastName;
	
	public Student(final String name, final String lastName) {
		_name = name;
		_lastName = lastName;
	}
	
	public String getInfo() {
		return getFullName();
	}

	private String getFullName() {
		return _name + " " + _lastName;		
	}
		
}
