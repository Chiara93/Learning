package replaceDelegationWithInheritance;

public class Employee extends Person{
	
	public String toString () {
		return "Emp: " + getLastName();
	}
}
