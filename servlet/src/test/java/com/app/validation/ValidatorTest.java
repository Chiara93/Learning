package com.app.validation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ValidatorTest {
	
	private Validator _validator;
	
	@Before
	public void setup() {
		Map<String, Collection<Rule>> rules =  new HashMap<>();
		Map<String, String> requestFields = new HashMap<>();
		
		rules.put(Rule.COURSE_NAME, Arrays.asList(new NotEmptyRule(), new MaxLengthRule(Rule.MAX_LENGTH_NAME)));
		rules.put(Rule.COURSE_START, Arrays.asList(new NotEmptyRule(), new ValidDateFormatRule()));
		rules.put(Rule.COURSE_LOCATION, Arrays.asList(new NotEmptyRule(), new MaxLengthRule(Rule.MAX_LENGTH_LOCATION)));
		rules.put(Rule.COURSE_SEATS, Arrays.asList(new NotEmptyRule(), new PositiveNumberRule(), new MaxLengthRule(Rule.MAX_LENGTH_SEATS), new LowerThanRule()));
		
		requestFields.put(Rule.COURSE_NAME, "Maths");
		requestFields.put(Rule.COURSE_START, "20.05.2017");
		requestFields.put(Rule.COURSE_LOCATION, "Lugano");
		requestFields.put(Rule.COURSE_SEATS, "30");
		requestFields.put(Rule.COURSE_DESCRIPTION, "description");
		
		_validator = new Validator(rules, requestFields);
	}
	
	@Test
	public void isValidTest() {
		assertTrue(_validator.isValid());
	}
}
