package replaceTypeCodeWithState;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceTypeCodeWithStateTest {
	private Employee engineer;
	private Employee salesman;
	private Employee manager;
	
	@Before
	public void setUp() {
		engineer = new Employee(EmployeeType.newType(EmployeeType.ENGINEER));
		salesman = new Employee(EmployeeType.newType(EmployeeType.SALESMAN));
		manager = new Employee(EmployeeType.newType(EmployeeType.MANAGER));	
	}
	
	@Test
	public void getType() {
		assertEquals(0, engineer.getType(), 0);
		assertEquals(1, salesman.getType(), 0);
		assertEquals(2, manager.getType(), 0);
	}
	
	@Test
	public void payAmount() {
		assertEquals(4000.0, engineer.payAmount(), 0.0);
		assertEquals(4050.5, salesman.payAmount(), 0.0);
		assertEquals(4100.0, manager.payAmount(), 0.0);
	}
}
