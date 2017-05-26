package replaceTypeCodeWithState;

public class Employee {

	private EmployeeType _employeeType;
	private double _monthlySalary = 4000.0;
	private double _commission = 50.5;
	private double _bonus = 100.0;
	
	Employee (EmployeeType employeeType) {
		_employeeType = employeeType;
	}

	public int getType() {
		return _employeeType.getType();
	}

	public void setType(EmployeeType employeeType) {
		_employeeType = employeeType;
	}

	public double payAmount() {
		switch (_employeeType.getType()) {
		case EmployeeType.ENGINEER:
			return _monthlySalary;
		case EmployeeType.SALESMAN:
			return _monthlySalary + _commission;
		case EmployeeType.MANAGER:
			return _monthlySalary + _bonus;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}
}
