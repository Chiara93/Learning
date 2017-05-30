package pullUpMethod;

import java.util.Date;

public class PreferredCustomer extends Customer{

	@Override
	protected double chargeFor(Date lastBillDate, Date date) {
		return (date.getTime() - lastBillDate.getTime()) * 0.03;
	}

}
