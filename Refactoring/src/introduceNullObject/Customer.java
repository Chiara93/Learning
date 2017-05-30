package introduceNullObject;

public class Customer {
	private String _name;
	private PaymentHistory _history;
	
	protected Customer() {
		
	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String setPlan() {
		return BillingPlan.special();
	}
	
	public PaymentHistory getHistory() {
		return (_history == null) ? PaymentHistory.newNull(): _history;
	}
	
	public void setHistory() {
		_history = new PaymentHistory();
	}
	
	public boolean isNull() {
		return false;
	}
	
	public static Customer newNull() {
		return new NullCustomer();
	}
}
