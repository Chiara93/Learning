package substituteAlgorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SubstituteAlgorithmTest {
	
	private SubstituteAlgorithm substituteAlgorithm;
	
	@Before
	public void setUp() {
		substituteAlgorithm = new SubstituteAlgorithm();
	}
	
	@Test
	public void foundPerson() {
		String[] people = new String[]{"Kent", "Chiara", "Matteo"};
		String expected = substituteAlgorithm.foundPerson(people);
		assertEquals("Kent", expected);
	}
}
