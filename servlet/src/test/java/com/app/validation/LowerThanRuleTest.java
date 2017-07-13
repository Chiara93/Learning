package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LowerThanRuleTest {
	
	private LowerThanRule _rule;
	
	@Before
	public void setup() {
		_rule = new LowerThanRule();
	}
	
	@Test
	public void checkLowerThanTrue() {
		assertTrue(_rule.check("99"));
	}
	
	@Test
	public void checkLowerThanFalse() {
		assertFalse(_rule.check("100"));
		assertFalse(_rule.check("-100"));
		assertFalse(_rule.check("test"));
	}
}
