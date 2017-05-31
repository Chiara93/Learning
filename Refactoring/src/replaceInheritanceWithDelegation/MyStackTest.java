package replaceInheritanceWithDelegation;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void test() {
		MyStack stack = new MyStack();
		String obj1 = "Chiara";
		Integer obj2 = new Integer(24);
		stack.push(obj1);
		stack.push(obj2);
		
		assertEquals(2, stack.size(), 0);
		assertFalse(stack.isEmpty());
		assertEquals(24, stack.pop());
		assertEquals("Chiara", stack.pop());
		assertTrue(stack.isEmpty());
	}
}
