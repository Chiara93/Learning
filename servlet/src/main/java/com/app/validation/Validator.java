package com.app.validation;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Validator {
	private final Map<String, Collection<Rule>> _rules;
	private final Map<String, String> _requestFields;
	
	public Validator(Map<String, Collection<Rule>> rules, Map<String, String> requestFields) {
		_rules = rules;
		_requestFields = requestFields;
	}
	
	public Map<String, Set<String>> validate() {
		boolean errorKeyFound = false;
		Map<String, Set<String>> errors = new HashMap<>();
		for (String key : _rules.keySet()) {
			Set<String> rulesErrors = new HashSet<>();
			for (Rule rule : _rules.get(key)) {
				if(!rule.check(_requestFields.get(key))) {
					errorKeyFound = true;
					rulesErrors.add(rule.message());
				}
			}
			if(errorKeyFound)
				errors.put(key, rulesErrors);
			errorKeyFound = false;
		}
		return errors;
	}
	
	public boolean isValid() {
		return validate().isEmpty();
	}

	public String get(String key) {
		return _requestFields.get(key);
	}
}
