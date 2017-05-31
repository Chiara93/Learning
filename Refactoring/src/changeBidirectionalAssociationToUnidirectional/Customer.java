package changeBidirectionalAssociationToUnidirectional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Customer {
	private static Collection<Customer> customers = new ArrayList<>();
	private Set _orders = new HashSet();

	void addOrder(Order arg) {
		_orders.add(arg);
	}

	public Set friendOrders() {
		return _orders;
	}

	public int getDiscount() {
		return 5;
	}

	public double getPriceFor(Order order) {
		if(containsOrder(order)) {
			return order.getDiscountedPrice(this);
		}
		return 0.0;
	}

	public static Collection getInstances() {
		return customers;
	}

	public boolean containsOrder(Order order) {
		return _orders.contains(order);
	}
}
