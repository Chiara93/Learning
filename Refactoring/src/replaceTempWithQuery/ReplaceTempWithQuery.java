package replaceTempWithQuery;

public class ReplaceTempWithQuery {
	private int _quantity;
	private int _itemPrice;
	
	public ReplaceTempWithQuery(int quantity, int itemPrice) {
		_quantity = quantity;
		_itemPrice = itemPrice;
	}
	
	public double getPrice() {
		return getBasePrice() * getDiscountFactor();
	}
	
	private int getBasePrice() {
		return _quantity * _itemPrice;
	}
	
	private double getDiscountFactor() {
		if (getBasePrice() > 1000) 
			return 0.95;
		else return 0.98;
	}
}
