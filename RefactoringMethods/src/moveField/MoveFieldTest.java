package moveField;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoveFieldTest {
	
	@Test
	public void interestForAmount_days() {
		Account account = new Account(new AccountType(0.01));
		assertEquals(0.01369863, account.interestForAmount_days(100.0, 5), 0.01369863);
		
	}
}
