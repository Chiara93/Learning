package com.app.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidDateFormatRule extends Rule {
	public static SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");
	
	@Override
	public boolean check(String value) {
		Date date = null;
		boolean valid = true;
		try {	
			date = SDF.parse(value);
			if(!value.equals(SDF.format(date))) //2017.05.05 andava bene lo stesso
				return false;
		} catch (ParseException e) {
			valid = false;
		}	
		return valid;
	}

	@Override
	public String message() {
		return "must have format dd.MM.yyyy";
	}

}
