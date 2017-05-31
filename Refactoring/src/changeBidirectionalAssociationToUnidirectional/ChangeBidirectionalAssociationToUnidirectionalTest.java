package changeBidirectionalAssociationToUnidirectional;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChangeBidirectionalAssociationToUnidirectionalTest {
	
	@Test
	public void test() {
		Customer customer = new Customer();
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		customer.addOrder(order1);
		customer.addOrder(order2);
		customer.addOrder(order3);
			
		assertEquals(-80, order1.getDiscountedPrice(customer), 0);
	}
}
