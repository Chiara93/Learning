package introduceNullObject;

public class Site {
	private Customer _customer;
	
	public Customer getCustomer() {
		return (_customer == null) ?
				Customer.newNull():
					_customer;
	}
	
	public void setCustomer(Customer customer) {
		_customer = customer;
	}

}
