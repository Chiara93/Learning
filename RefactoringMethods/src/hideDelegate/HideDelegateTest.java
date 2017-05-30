package hideDelegate;

import static org.junit.Assert.*;

import org.junit.Test;

public class HideDelegateTest {
	
	@Test
	public void test() {
		Person john = new Person("John");
		Person manager = new Person("Manager");
		Department department = new Department(manager);
		john.setDepartment(department);
		
		// Call intermediate object
		Person resultManager = john.getManager();
		assertEquals("Manager", resultManager.getName());
	}
}
