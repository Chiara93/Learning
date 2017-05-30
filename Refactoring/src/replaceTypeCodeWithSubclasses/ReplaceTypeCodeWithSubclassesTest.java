package replaceTypeCodeWithSubclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceTypeCodeWithSubclassesTest {
	
	@Test
	public void test() {
		Employee engineer = Employee.create(Employee.ENGINEER);
		Employee salesman = Employee.create(Employee.SALESMAN);
		Employee manager = Employee.create(Employee.MANAGER);
		
		assertEquals(0, engineer.getType(),0);
		assertEquals(1, salesman.getType(),0);
		assertEquals(2, manager.getType(),0);	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		Employee wrongEmployee = Employee.create(3);
		assertEquals(3, wrongEmployee.getType(),0);	
	}
}
