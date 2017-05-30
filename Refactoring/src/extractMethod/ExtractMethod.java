package extractMethod;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
	private Vector<Order> _orders;
	private String _name;
	
	public ExtractMethod(String name, Vector<Order> orders) {
		_name = name;
		_orders = orders;
	}
	
	public void printOwing() {
		printBanner();
		printDetails();
	}

	private void printBanner() {
		System.out.println ("**************************");
		System.out.println ("***** Customer Owes ******");
		System.out.println ("**************************");
	}
	
	private double getOutstanding() {
		Enumeration e = _orders.elements();
		double result = 0.0;
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
	
	private void printDetails() {
		System.out.println ("name:" + _name);
		System.out.println ("amount" + getOutstanding());
	}
}
