package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class LessOrEqualThanRuleTest {
	
	@Test
	public void checkLessOrEqualThanTrue() {
		LessOrEqualThanRule rule = new LessOrEqualThanRule("30");
		assertTrue(rule.check("29"));
		assertTrue(rule.check("0"));
	}
	
	@Test
	public void checkLessOrEqualThanFalse() {
		LessOrEqualThanRule rule = new LessOrEqualThanRule("15");
		assertFalse(rule.check("16"));
		
		LessOrEqualThanRule rule1 = new LessOrEqualThanRule("test");
		assertFalse(rule1.check("16"));
	}
}
