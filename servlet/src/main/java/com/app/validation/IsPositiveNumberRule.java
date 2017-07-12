package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class IsPositiveNumberRule extends Rule {

	@Override
	public boolean check(String field) {
		return StringUtils.isNumeric(field);
	}

	@Override
	public String message() {
		return "Can't be a negative number";
	}

}
