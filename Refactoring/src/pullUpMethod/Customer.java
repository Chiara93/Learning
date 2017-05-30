package pullUpMethod;

import java.util.Date;

public abstract class Customer {
	private double _total = 0.0;
	private Date _lastBillDate;

	private void addBill(Date date, double amount) {
		_total += amount;
		_lastBillDate = date;
	}

	public void createBill (Date date) {
		double chargeAmount = chargeFor(_lastBillDate, date);
		addBill(date, chargeAmount);
	}

	abstract protected double chargeFor(Date lastBillDate, Date date);
}
