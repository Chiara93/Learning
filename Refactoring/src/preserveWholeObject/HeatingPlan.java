package preserveWholeObject;

public class HeatingPlan {
	
	private TempRange _range;
	
	public HeatingPlan(TempRange range) {
		_range = range;
	}
	
	public boolean withinRange (TempRange roomRange) {
		return _range.includes(roomRange);
    }
    
}
