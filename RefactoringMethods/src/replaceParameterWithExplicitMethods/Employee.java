package replaceParameterWithExplicitMethods;

public class Employee {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	static Employee createEngineer() {
		return new Engineer();
	}
	
	static Employee createSalesman() {
		return new Salesman();
	}
	
	static Employee createManager() {
		return new Manager();
	}
}
