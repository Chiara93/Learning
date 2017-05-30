package introduceParameterObject;

import java.util.Date;

public class DateRange {
	private final Date _startDate;
	private final Date _endDate;

	public DateRange(Date startDate, Date endDate) {
		_startDate = startDate;
		_endDate = endDate;
	}
	
	public Date getStartDate() {
		return _startDate;
	}

	public Date getEndDate() {
		return _endDate;
	}
	
	public boolean includes(Date date) {
		return (date.equals(_startDate) ||
				date.equals(_endDate) ||
				(date.after(_startDate) && 
						date.before(_endDate)));
	}
}
