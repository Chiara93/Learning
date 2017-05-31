package replaceDelegationWithInheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceDelagationWithInheritanceTest {
	
	@Test
	public void test() {
		Employee employee = new Employee();
		employee.setName("Chiara Ferrario");
		
		assertEquals("Chiara Ferrario", employee.getName());
		assertEquals("Ferrario", employee.getLastName());
		assertEquals("Emp: Ferrario", employee.toString());
		
	}
}
