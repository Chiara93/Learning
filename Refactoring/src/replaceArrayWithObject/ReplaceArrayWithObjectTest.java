package replaceArrayWithObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReplaceArrayWithObjectTest {
	
	@Test
	public void test() {
		Performance row = new Performance();
		row.setName("Liverpool");
		row.setWins("15");
		row.setLosses("10");
		
		assertEquals(row.getName(), "Liverpool");
		assertEquals(row.getWins(), "15");
		assertEquals(row.getLosses(), "10");
		
	}
}
