package replaceTypeCodeWithSubclasses;

public class Manager extends Employee {
	@Override
	public int getType() {
		return Employee.MANAGER;
	}
}
