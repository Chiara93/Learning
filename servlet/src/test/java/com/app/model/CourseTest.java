package com.app.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	
	private Course _course;
	
	@Before
	public void setup() {
		_course = new Course("italian", 1, "grammar rules");
	}
	
	@Test
	public void nameTest() {
		assertEquals("italian", _course.name());
	}
	
	@Test
	public void numberTest() {
		assertEquals(1, _course.number());
	}
	
	@Test
	public void descriptionTest() {
		assertEquals("grammar rules", _course.description());
	}
}
