package moveMethod;

public class Account {
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;

	private double overdraftCharge() {
		return _type.overdraftCharge(this);
	}

	public double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0) result += overdraftCharge();
		return result;
	}
	
	public int getDaysOverDrawn() {
		return _daysOverdrawn;
	}
	
	public void setDaysOverDrawn(int days) {
		_daysOverdrawn = days;
	}
	
	public AccountType getType() {
		return _type;
	}
}

