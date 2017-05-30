package decomposeConditional;

import java.util.Date;

public class DecomposeConditional {
	private Date SUMMER_START = new Date(117, 5, 21);
	private Date SUMMER_END = new Date(117, 8, 20);
	private int _winterRate = 6;
	private int _winterServiceCharge = 2;
	private int _summerRate = 12;
	
	public int chargeOnSeason(Date date, int quantity) {
		if (notSummer(date))
			return chargeWinter(quantity);
		else 
			return chargeSummer(quantity);
	}
	
	private int chargeWinter(int quantity) {		
		return quantity * _winterRate + _winterServiceCharge;
	}
	
	private int chargeSummer(int quantity) {		
		return quantity * _summerRate;
	}

	private boolean notSummer(Date date) {
		return date.before (SUMMER_START) || date.after(SUMMER_END);
	}
}
