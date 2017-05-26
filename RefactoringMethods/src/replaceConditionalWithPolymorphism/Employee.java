package replaceConditionalWithPolymorphism;

public class Employee {

	private EmployeeType _employeeType;
	private double _monthlySalary = 4000.0;
	private double _commission = 50.5;
	private double _bonus = 100.0;
	
	public Employee (EmployeeType employeeType) {
		_employeeType = employeeType;
	}

	public int getType() {
		return _employeeType.getType();
	}

	public void setType(EmployeeType employeeType) {
		_employeeType = employeeType;
	}

	public double payAmount() {
		return _employeeType.payAmount(this);
	}
	
	public double getMonthlySalary() {
		return _monthlySalary;
	}
	
	public double getCommission() {
		return _commission;
	}
	
	public double getBonus() {
		return _bonus;
	}
}
