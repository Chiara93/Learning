package hideDelegate;

public class Person {
	private String _name;
	private Department _department;
	
	public Person(String name) {
		_name = name;
	}
	
	public void setDepartment(Department arg) {
		_department = arg;
	}

	public Person getManager() {
		return _department.getManager();
	}
	
	public String getName() {
		return _name;
	}
}
