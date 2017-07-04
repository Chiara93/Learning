package com.app.validation;

public abstract class Rule {
	public static String COURSE_NAME = "name";
	public static String COURSE_NUMBER = "number";
	public static String COURSE_START = "start";
	public static String COURSE_LOCATION = "location";
	public static String COURSE_SEATS = "seats";
	public static String COURSE_DESCRIPTION = "description";
	
	
	public abstract boolean check(String value);
	public abstract String message();
}
