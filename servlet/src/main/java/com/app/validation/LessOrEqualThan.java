package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class LessOrEqualThan extends Rule {
	
	private final String _toCompare;
	
	public LessOrEqualThan(String toCompare) {
		_toCompare = toCompare;
	}
	
	@Override
	public boolean check(String value) {
		if(value.equals("0")) 
			return true;
		if (StringUtils.isNumeric(value) && StringUtils.isNumeric(_toCompare))
			return Integer.valueOf(value) <= Integer.valueOf(_toCompare);
		return false;
	}

	@Override
	public String message() {
		return "Number has to be minus than seats";
	}

}
