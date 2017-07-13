package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxLengthRuleTest {
	
	@Test
	public void checkMaxLengthName() {
		MaxLengthRule rule =  new MaxLengthRule(Rule.MAX_LENGTH_NAME);
		assertTrue(rule.check("Algebra lineare"));
		
		assertFalse(rule.check("Letteratura e grammatica italiana"));
	}
	
	@Test
	public void checkMaxLengthLocation() {
		MaxLengthRule rule =  new MaxLengthRule(Rule.MAX_LENGTH_LOCATION);
		assertTrue(rule.check("Lugano"));
		
		assertFalse(rule.check("Location field must have no more than 20 chars"));
	}
	
	@Test
	public void checkMaxLengthSeats() {
		MaxLengthRule rule =  new MaxLengthRule(Rule.MAX_LENGTH_SEATS);
		assertTrue(rule.check("100"));
		
		assertFalse(rule.check("1000"));
	}
}
