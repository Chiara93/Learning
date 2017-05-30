package introduceParameterObject;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

public class IntroduceParameterObjectTest {
	
	private Account account;
	private DateRange range;
	
	@Before
	public void setUp() {
		Entry entry1 = new Entry(1.0, new Date(117, 1, 10));
		Entry entry2 = new Entry(2.5, new Date(116, 0, 1));
		Vector entries = new Vector<>();
		entries.add(entry1);
		entries.add(entry2);
		account = new Account(entries);
		range = new DateRange(new Date(117, 0, 1), new Date(117, 4, 20));
	}
	
	@Test
	public void getFlowBetween() {
		double flow = account.getFlowBetween(range);
		assertEquals(1.0, flow, 0.0);
	}
}
