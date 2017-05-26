package replaceTypeCodeWithSubclasses;

public class Salesman extends Employee {
	
	@Override
	public int getType() {
		return Employee.SALESMAN;
	}
}
