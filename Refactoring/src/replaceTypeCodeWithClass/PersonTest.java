package replaceTypeCodeWithClass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person person1;
	private Person person2;
	
	@Before
	public void setUp() {
		person1 = new Person(BloodGroup.O);
		person2 = new Person(BloodGroup.A);
	}
	
	@Test
	public void getBloodGroupCode() {
		int code1 = person1.getBloodGroup().getCode();
		int code2 = person2.getBloodGroup().getCode();
		assertEquals(0, code1, 0);
		assertEquals(1, code2, 0);
	}
}
