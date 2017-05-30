package replaceMethodWithMethodObject;

public class Account {
	
	private int _delta;
	
	public Account(int delta) {
		_delta = delta;
	}
	
	public int gamma (int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}
	
	protected int delta() {
		return _delta;
	}
}
