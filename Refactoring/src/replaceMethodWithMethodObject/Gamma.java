package replaceMethodWithMethodObject;

public class Gamma {
	private final Account _account;
	private int _inputVal;
	private int _quantity;
	private int _yearToDate;	
	private int _importantValue1;
	private int _importantValue2;
	private int _importantValue3;
	
	public Gamma(Account account, int inputVal, int quantity, int yearToDate) {
		_account = account;
		_inputVal = inputVal;
		_quantity = quantity;
		_yearToDate = yearToDate;
	}
	
	public int compute() {
		_importantValue1 = (_inputVal * _quantity) + _account.delta();
		_importantValue2 = (_inputVal * _yearToDate) + 100;
		importantThing();	
		_importantValue3 = _importantValue2 * 7;
		return _importantValue3 -2 * _importantValue1;
	}
	
	private void importantThing() {
		if ((_yearToDate - _importantValue1) > 100)
			_importantValue2 -= 20;
	}
}
