package encapsulateField;

public class Person {
	private String _name;
	
	public Person(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String arg) {
		_name = arg;
	}
}
