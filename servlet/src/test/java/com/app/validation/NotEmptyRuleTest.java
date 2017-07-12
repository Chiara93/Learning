package com.app.validation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotEmptyRuleTest {
	
	private NotEmptyRule _rule;
	
	@Before
	public void setup() {
		_rule = new NotEmptyRule();
	}
	
	@Test
	public void checkNotEmptyTrue() {
		assertTrue(_rule.check("Maths"));
	}
	
	@Test
	public void checkNotEmptyFalse() {
		assertFalse(_rule.check(""));
	}
}
