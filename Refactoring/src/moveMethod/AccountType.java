package moveMethod;

public class AccountType {
	private boolean _type = false;
	
	double overdraftCharge(Account account) {
		int daysOverdrawn = account.getDaysOverDrawn();
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
			return result;
		}
		else return daysOverdrawn * 1.75;
	}
	
	public boolean isPremium() {
		return _type;
	}
	
	public void setPremium() {
		_type = true;
	}
}
