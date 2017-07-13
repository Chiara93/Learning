package com.app.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateCourseControllerTest {
	@Test
	public void handlesRoute() throws Exception {
		assertTrue(new CreateCourseController().handles("/course/create"));
	}
}
