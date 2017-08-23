package com.app.validation;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RuleFactory {
	
	public static Map<String, Collection<Rule>> rules() {
		Map<String, Collection<Rule>> rules = new HashMap<>();
		rules.put(Rule.COURSE_NAME, Arrays.asList(new NotEmptyRule(), new MaxLengthRule(Rule.MAX_LENGTH_NAME)));
		rules.put(Rule.COURSE_NUMBER, Arrays.asList(new NotEmptyRule(), new PositiveNumberRule()));
		rules.put(Rule.COURSE_START, Arrays.asList(new NotEmptyRule(), new ValidDateFormatRule()));
		rules.put(Rule.COURSE_LOCATION, Arrays.asList(new NotEmptyRule(), new MaxLengthRule(Rule.MAX_LENGTH_LOCATION)));
		rules.put(Rule.COURSE_SEATS, Arrays.asList(new NotEmptyRule(), new PositiveNumberRule(), new MaxLengthRule(Rule.MAX_LENGTH_SEATS), new LowerThanRule()));		
		return rules;
	}
}
