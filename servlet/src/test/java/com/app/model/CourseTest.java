package com.app.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	
	private Course _course;
	
	@Before
	public void setup() {
		_course = new Course("italian", 1, "grammar rules", "Manno", new Date(117, 3, 21), 20);
	}
	
	@Test
	public void nameTest() {
		assertEquals("italian", _course.name());
	}
	
	@Test
	public void numberTest() {
		assertEquals(1, _course.id());
	}
	
	@Test
	public void descriptionTest() {
		assertEquals("grammar rules", _course.description());
	}
	
	@Test
	public void locationTest() {
		assertEquals("Manno", _course.location());
	}
	
	@Test
	public void dateTest() {
		assertEquals(new Date(117, 3, 21), _course.date());
	}
	
	@Test
	public void seatsLeftTest() {
		assertEquals(20, _course.seatsLeft());
	}
}
