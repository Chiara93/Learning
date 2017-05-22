package smell;
 
class OrderItem {
    protected int _productID;
    private int _imageID;
    private int _quantity;
    private int _unitPrice;
 
    public OrderItem(int prodID, int ImageID, int inQty) {
        _productID = prodID;
        _imageID = ImageID;
        _quantity = inQty;
    }
 
    int getProductID() {
        return _productID;
    }
 
    int getImageID() {
        return _imageID;
    }
 
    int getQuantity() {
        return _quantity;
    }
 
    int getUnitPrice() {
        return _unitPrice;
    }
 
    public void setProductID(int id) {
        _productID = id;
    }
 
    public void setImageID(int ID) {
        _imageID = ID;
    }
 
    public void setQty(int qty) {
        this._quantity = qty;
    }
 
    public void setUnitPrice(int i) {
        _unitPrice = i;
    }
    
    public int getTotal() {
    	return _unitPrice * _quantity;
    }
    
    public String getSummary() {
    	return "Begin Line Item\n" +
    		   "Product = " + _productID + "\n" +
    		   "Image = " + _imageID + "\n" +
    		   "Quantity = " + _quantity + "\n" +
    		   "Total = " + getTotal() + "\n" +
    		   "End Line Item";
    }
}
