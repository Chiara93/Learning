package removeMiddleMan;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveMiddleManTest {
	
	@Test
	public void test() {
		Person john = new Person("John");
		Person manager = new Person("Manager");
		Department department = new Department(manager);
		john.setDepartment(department);
		
		// Call delegate directly
		Person resultManager = john.getDepartment().getManager();
		assertEquals("Manager", resultManager.getName());
	}
}
