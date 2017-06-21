package com.app.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SeminarTest {
	
	private Seminar _seminar;
	private Course _course;
	
	@Before
	public void setup() {
		_course = new Course("italian", 1, "grammar rules");
		_seminar = new Seminar(_course, "Manno", new Date(117, 3, 21), 20);
	}
	
	@Test
	public void locationTest() {
		assertEquals("Manno", _seminar.location());
	}
	
	@Test
	public void dateTest() {
		assertEquals(new Date(117, 3, 21), _seminar.date());
	}
	
	@Test
	public void seatsLeftTest() {
		assertEquals(20, _seminar.seatsLeft());
	}
}
