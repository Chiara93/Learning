package preserveWholeObject;

public class Room {
	
	private TempRange _range;
	
	public Room(TempRange range) {
		_range = range;		
	}
	
	public boolean	withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}
	
	private TempRange daysTempRange() {
		return _range;
	}
}
