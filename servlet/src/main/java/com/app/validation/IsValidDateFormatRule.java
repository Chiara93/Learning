package com.app.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IsValidDateFormatRule extends Rule {

	@Override
	public boolean check(String value) {
		Date date = null;
		boolean valid = true;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			date = sdf.parse(value);
			if(!value.equals(sdf.format(date))) //2017.05.05 andava bene lo stesso
				return false;
		} catch (ParseException e) {
			valid = false;
		}	
		return valid;
	}

	@Override
	public String message() {
		return "Date must have format dd.MM.yyyy";
	}

}
