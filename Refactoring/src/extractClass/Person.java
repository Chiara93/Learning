package extractClass;

public class Person {
	private TelephoneNumber _telephoneNumber = new TelephoneNumber();
	private String _name;
	
	public Person(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return _telephoneNumber.getTelephoneNumber();
	}
	
	public String getOfficeAreaCode() {
		return _telephoneNumber.getOfficeAreaCode();
	}
	
	public void setOfficeAreaCode(String arg) {
		_telephoneNumber.setOfficeAreaCode(arg);
	}
	
	public String getOfficeNumber() {
		return _telephoneNumber.getOfficeNumber();
	}
	
	public void setOfficeNumber(String arg) {
		_telephoneNumber.setOfficeNumber(arg);
	}
}
