package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class LowerThanRule extends Rule {

	@Override
	public boolean check(String value) {
		if(StringUtils.isNumeric(value))
			return Integer.parseInt(value) < Rule.MAX_VALUE_SEATS;
		return false;
	}

	@Override
	public String message() {
		return "must be lower than " + Rule.MAX_VALUE_SEATS;
	}

}
