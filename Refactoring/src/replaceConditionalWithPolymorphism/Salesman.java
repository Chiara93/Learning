package replaceConditionalWithPolymorphism;

public class Salesman extends EmployeeType{
	
	@Override
	public int getType() {
		return EmployeeType.SALESMAN;
	}
	
	@Override
	public double payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getCommission();
	}
}
