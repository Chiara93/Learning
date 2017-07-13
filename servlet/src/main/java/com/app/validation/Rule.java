package com.app.validation;

public abstract class Rule {
	public static String COURSE_NAME = "name";
	public static String COURSE_NUMBER = "number";
	public static String COURSE_START = "start";
	public static String COURSE_LOCATION = "location";
	public static String COURSE_SEATS = "seats";
	public static String COURSE_DESCRIPTION = "description";
	
	public static int MAX_LENGTH_NAME = 15;
	public static int MAX_LENGTH_LOCATION = 20;
	public static int MAX_LENGTH_SEATS = 3;
	
	public static int MAX_VALUE_SEATS = 100;
	
	public abstract boolean check(String value);
	public abstract String message();
}
