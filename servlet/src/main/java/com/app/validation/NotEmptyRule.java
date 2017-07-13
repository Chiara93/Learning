package com.app.validation;

import org.apache.commons.lang3.StringUtils;

public class NotEmptyRule extends Rule {

	@Override
	public boolean check(String field) {
		return StringUtils.isNotEmpty(field);
	}

	@Override
	public String message() {
		return "can't be empty";
	}

}
