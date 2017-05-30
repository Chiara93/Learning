package moveField;

public class AccountType {
	private double _interestRate;
	
	public AccountType(double interestRate) {
		_interestRate = interestRate;
	}
	
	public void setInterestRate (double arg) {
		_interestRate = arg;
	}

	public double getInterestRate () {
		return _interestRate;
	}
}
