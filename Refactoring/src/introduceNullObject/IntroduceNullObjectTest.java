package introduceNullObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntroduceNullObjectTest {
	
	@Test
	public void testCustomerNotNull() {	
		Site site = new Site();
		Customer customer = new Customer();
		customer.setName("Chiara");
		customer.setHistory();	
		String plan = customer.setPlan();
		int weeksDelinquentInLastYear =  customer.getHistory().getWeeksDelinquentInLastYear();
		
		site.setCustomer(customer);
		
		assertEquals("Chiara", customer.getName());
		assertEquals("special", plan);
		assertFalse(customer.isNull());
		assertEquals(10, weeksDelinquentInLastYear, 0);
	}
	
	@Test
	public void testCustomerNull() {
		Site site = new Site();
		Customer customer = site.getCustomer();
		String plan = customer.setPlan();	
		int weeksDelinquentInLastYear =  customer.getHistory().getWeeksDelinquentInLastYear();
		
		assertEquals("occupant", customer.getName());
		assertEquals("basic", plan);
		assertTrue(customer.isNull());
		assertEquals(0, weeksDelinquentInLastYear, 0);
	}
}
