package replaceConditionalWithPolymorphism;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReplaceConditionalWithpolymorphismTest {
	
	@Test
	public void payAmount() {
		Employee engineer = new Employee(EmployeeType.newType(EmployeeType.ENGINEER));
		Employee salesman = new Employee(EmployeeType.newType(EmployeeType.SALESMAN));
		Employee manager = new Employee(EmployeeType.newType(EmployeeType.MANAGER));
		
		assertEquals(4000.0, engineer.payAmount(), 0.0);
		assertEquals(4050.5, salesman.payAmount(), 0.0);
		assertEquals(4100.0, manager.payAmount(), 0.0);
	}
}
