package decomposeConditional;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DecomposeConditionalTest {
	
	@Test
	public void chargeOnSeasonTest() {
		DecomposeConditional decompose = new DecomposeConditional();
		int result = decompose.chargeOnSeason(new Date(), 2);
		assertEquals(14, result, 0);
	}
}
