package replaceConditionalWithPolymorphism;

public class Engineer extends EmployeeType{
	
	@Override
	public int getType() {
		return EmployeeType.ENGINEER;
	}
	
	@Override
	public double payAmount(Employee employee) {
		return employee.getMonthlySalary();
	}
	
}
