package extractClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExtractClassTest {
	private Person p;
	
	@Before
	public void setUp() {
		p = new Person("Chiara");
		p.setOfficeAreaCode("I2");
		p.setOfficeNumber("034488396");
	}
	
	@Test
	public void getName() {
		assertEquals("Chiara", p.getName());
	}
	
	@Test
	public void getOfficeAreaCode() {
		assertEquals("I2", p.getOfficeAreaCode());
	}
	
	@Test
	public void getOfficeNumber() {
		assertEquals("034488396", p.getOfficeNumber());
	}
	
	@Test
	public void getTelephoneNumber() {
		assertEquals("(I2) 034488396", p.getTelephoneNumber());
	}
}
