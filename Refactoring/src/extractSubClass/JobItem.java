package extractSubClass;

public class JobItem {
	
	private int _unitPrice;
	private int _quantity;
	
	protected JobItem (int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	
	public int getTotalPrice() {
		return getUnitPrice() * _quantity;
	}
	
    public int getUnitPrice(){
        return _unitPrice;
    }
    
	public int getQuantity(){
		return _quantity;
	}
	
	protected boolean isLabor() {
        return false;
    }
	
}
