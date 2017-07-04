package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class IsNumber extends Rule {

	@Override
	public boolean check(String value) {
		return StringUtils.isNumeric(value);
	}

	@Override
	public String message() {
		return null;
	}

}
