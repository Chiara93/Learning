package com.app.model;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SeminarTest {
	
	private Seminar _seminar;
	
	@Before
	public void setup() {
		_seminar = new Seminar("italian", 1, "grammar rules", "Manno", new Date(117, 3, 21), 20);
	}
	
	@Test
	public void nameTest() {
		assertEquals("italian", _seminar.name());
	}
	
	@Test
	public void numberTest() {
		assertEquals(1, _seminar.id());
	}
	
	@Test
	public void descriptionTest() {
		assertEquals("grammar rules", _seminar.description());
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
