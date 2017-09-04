package com.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerFactory {
	public static List<Controller> controllers() {
		return new ArrayList<>(Arrays.asList(new CreateCourseController(), new ShowCourseController(), new UpdateCourseController()));
	}
}
