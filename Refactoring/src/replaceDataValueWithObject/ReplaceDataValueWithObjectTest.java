package replaceDataValueWithObject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ReplaceDataValueWithObjectTest {
	
	private Collection<Order> orders;
	
	@Before
	public void setUp() {
		orders = new ArrayList<>();
		Order order1 = new Order("Chiara");
		Order order2 = new Order("Katia");
		Order order3 = new Order("Chiara");
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
	}
	@Test
	public void numberOfOrdersFor() {
		int result = ReplaceDataValueWithObject.numberOfOrdersFor(orders, "Chiara");
		assertEquals(2, result, 0);
	}
}
