package com.app.validation;

public class NotEmptyRule extends Rule {

	@Override
	public boolean check(String field) {
		return !field.isEmpty();
	}

	@Override
	public String message() {
		return "Can't be empty";
	}

}
