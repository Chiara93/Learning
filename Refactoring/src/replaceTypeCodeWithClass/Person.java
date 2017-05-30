package replaceTypeCodeWithClass;

public class Person {
	
	private BloodGroup _bloodGroup;

	public Person (BloodGroup bloodGroup) {
		_bloodGroup = bloodGroup;
	}
	
	public BloodGroup getBloodGroup() {
		return _bloodGroup;
	}
	
	public void setBloodGroup(BloodGroup bloodGroup) {
		_bloodGroup = bloodGroup;
	}
}
