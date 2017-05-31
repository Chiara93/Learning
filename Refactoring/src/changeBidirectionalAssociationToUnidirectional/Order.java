package changeBidirectionalAssociationToUnidirectional;

import java.util.Iterator;

public class Order {

	public Customer getCustomer() {
		Iterator iter = Customer.getInstances().iterator();
		while (iter.hasNext()) {
			Customer each = (Customer)iter.next();
			if (each.containsOrder(this)) return each;
		}
		return null;
	}

	public int getDiscountedPrice(Customer customer) {
		System.out.println(getGrossPrice() * (1 - customer.getDiscount()));
		return getGrossPrice() * (1 - customer.getDiscount());
	}

	private int getGrossPrice() {
		return 20;
	}
}
