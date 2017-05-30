package replaceMethodWithMethodObject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	private Account account;
	
	@Before
	public void setUp() {
		account = new Account(2);
	}
	
	@Test
	public void gamma() {
		int result = account.gamma(10, 2, 2017);
		assertEquals(141706, result, 0);
	}
}
