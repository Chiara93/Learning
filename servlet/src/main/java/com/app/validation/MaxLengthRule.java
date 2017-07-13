package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class MaxLengthRule extends Rule{
	
	private final int _maxLength;
	
	public MaxLengthRule(int maxLength) {
		_maxLength = maxLength;
	}
	
	@Override
	public boolean check(String value) {
		return StringUtils.length(value) <= _maxLength;
	}

	@Override
	public String message() {
		return "must have no more than " + _maxLength + " chars";
	}

}
