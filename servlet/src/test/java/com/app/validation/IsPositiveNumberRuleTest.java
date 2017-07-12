package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IsPositiveNumberRuleTest {
	
	private IsPositiveNumberRule _rule;
	
	@Before
	public void setup() {
		_rule = new IsPositiveNumberRule();
	}
	
	@Test
	public void checkIsPositiveNumberTrue() {
		assertTrue(_rule.check("10"));
	}
	
	@Test
	public void checkIsPositiveNumberFalse() {
		assertFalse(_rule.check("-10"));
		assertFalse(_rule.check("test"));
	}
}
