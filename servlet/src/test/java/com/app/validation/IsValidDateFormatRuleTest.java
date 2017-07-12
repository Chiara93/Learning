package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IsValidDateFormatRuleTest {
	
	private IsValidDateFormatRule _rule;
	
	@Before
	public void setup() {
		_rule = new IsValidDateFormatRule();
	}
	
	@Test
	public void checkIsValidDateFormatTrue() {
		assertTrue(_rule.check("20.05.2017"));
	}
	
	@Test
	public void checkIsValidDateFormatFalse() {
		assertFalse(_rule.check("20/05/2017"));
		assertFalse(_rule.check("2017/05/05"));
		assertFalse(_rule.check("2017.05.05"));
	}
}
