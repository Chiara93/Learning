package introduceParameterObject;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {

	private Vector _entries = new Vector();
	
	public Account(Vector entries) {
		_entries = entries;
	}
	
	public double getFlowBetween (DateRange range) {
		double result = 0;
		Enumeration e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if(range.includes(each.getDate())) {	
				result += each.getValue();	
			}
		}
		return result;
	}
}
