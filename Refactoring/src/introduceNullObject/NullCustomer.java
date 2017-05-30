package introduceNullObject;

public class NullCustomer extends Customer {
	
	@Override
	public boolean isNull() {
		return true;
	}
	
	@Override
	public String getName() {
		return "occupant";
	}
	
	@Override
	public String setPlan() {
		return BillingPlan.basic();
	}
}
