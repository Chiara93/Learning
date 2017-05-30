package preserveWholeObject;

import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTest {
	
	@Test
	public void withinPlanOk() {
		HeatingPlan plan = new HeatingPlan(new TempRange(5, 15));
		Room room = new Room(new TempRange(6, 10));
		boolean result = room.withinPlan(plan);
		assertTrue(result);
	}
	
	@Test
	public void withinPlanKo() {
		HeatingPlan plan = new HeatingPlan(new TempRange(10, 15));
		Room room = new Room(new TempRange(6, 10));
		boolean result = room.withinPlan(plan);
		assertFalse(result);
	}
}
