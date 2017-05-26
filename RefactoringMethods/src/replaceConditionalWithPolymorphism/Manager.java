package replaceConditionalWithPolymorphism;

public class Manager extends EmployeeType{

	@Override
	public int getType() {
		return EmployeeType.MANAGER;
	}
	
	@Override
	public double payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getBonus();
	}
}
