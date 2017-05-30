package introduceParameterObject;

import java.util.Date;

public class Entry {
	
	private Date _chargeDate;
    private double _value;
    
	public Entry (double value, Date chargeDate) {
        _value = value;
        _chargeDate = chargeDate;
    }
    
	public Date getDate(){
        return _chargeDate;
    }
    double getValue(){
        return _value;
    }
    
}
