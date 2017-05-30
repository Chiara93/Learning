package replaceTempWithQuery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceTempWithQueryTest {

	private ReplaceTempWithQuery replaceTempWithQuery;
	
	@Before
	public void setUp() {
		replaceTempWithQuery = new ReplaceTempWithQuery(10, 15);
	}
	
	@Test
	public void getPrice() {
		double price = replaceTempWithQuery.getPrice();
		
		assertEquals(147.0, price, 0.0);
	}
}
