package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class PositiveNumberRule extends Rule {

	@Override
	public boolean check(String field) {
		return StringUtils.isNumeric(field);
	}

	@Override
	public String message() {
		return "must be positive number";
	}

}
