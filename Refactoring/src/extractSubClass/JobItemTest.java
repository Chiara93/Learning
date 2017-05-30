package extractSubClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class JobItemTest {
	
	@Test
	public void getTotalPriceLabor() {
		LaborItem laborItem = new LaborItem(2, new Employee(5));
		int price = laborItem.getTotalPrice();
		assertEquals(10, price, 0);
	}
	
	public void getTotalPriceNotLabor() {
		JobItem jobItem = new JobItem(2, 6);
		int price = jobItem.getTotalPrice();
		assertEquals(12, price, 0);
	}
}
