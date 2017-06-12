package extractMethod;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class ExtractMethodTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private ExtractMethod method;
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		
		Vector<Order> orders = new Vector<>();
		Order order1 = new Order(5.10);
		Order order2 = new Order(3.90);
		orders.add(order1);
		orders.add(order2);
		
		method = new ExtractMethod("Chiara", orders);
	}
	
	@Test
	public void printOwing() {
		String expected = 
				"**************************\n" +
				"***** Customer Owes ******\n" +
				"**************************\n" +
				"name:Chiara\n" +
				"amount9.0\n";
		method.printOwing();
		assertEquals(expected,outContent.toString());
	}
}
