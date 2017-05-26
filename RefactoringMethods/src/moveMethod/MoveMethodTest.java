package moveMethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveMethodTest {
	
	@Test
	public void bankChargePremium() {
		Account account = new Account();
		account.setDaysOverDrawn(10);
		account.getType().setPremium();
		
		assertEquals(17.05, account.bankCharge(), 0.0);
	}
	
	@Test
	public void bankChargeNotPremium() {
		Account account = new Account();
		account.setDaysOverDrawn(10);
		
		assertEquals(22.0, account.bankCharge(), 0.0);
	}
}
