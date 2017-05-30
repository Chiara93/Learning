package pullUpMethod;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void chargeForRegular() {
		Customer regular = new RegularCustomer();
		Date lastBillDate = new Date(1472680800);
		Date date = new Date(1472680900);
		
		double chargeAmount = regular.chargeFor(lastBillDate, date);
		
		assertEquals(5.0, chargeAmount, 0.0);
	}
	
	@Test
	public void chargeForPreferred() {
		Customer regular = new PreferredCustomer();
		Date lastBillDate = new Date(1472680800);
		Date date = new Date(1472680900);
		
		double chargeAmount = regular.chargeFor(lastBillDate, date);
		
		assertEquals(3.0, chargeAmount, 0.0);
	}
}
