package smell;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

public class Order {

	private Vector<OrderItem> _orderList;

	public Order(Vector<OrderItem> list) {
		_orderList = list;
	}

	public boolean equals(Object aThat) {
		if ( this == aThat ) return true;
		if ( !(aThat instanceof Order) ) return false;
		Order that = (Order)aThat;
		return this._orderList.equals(that._orderList);
	}

	public void calculateAndwriteOrderTotal(PrintWriter pw) {
		int orderTotal = 0;
		Iterator iter = _orderList.iterator();
		OrderItem item;
		while (iter.hasNext()) {
			item = (OrderItem)iter.next();
			orderTotal += item.getTotal();
			pw.println(item.getSummary());
		}
		pw.println("Order total = " + orderTotal);
	}
}
