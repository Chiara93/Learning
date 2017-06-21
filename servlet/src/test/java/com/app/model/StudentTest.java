package com.app.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Student _student;
	
	@Before
	public void setup() {
		_student = new Student("Chiara", "Ferrario");
	}
	
	@Test
	public void nameTest() {
		assertEquals("Chiara", _student.name());
	}
	
	@Test
	public void lastNameTest() {
		assertEquals("Ferrario", _student.lastName());
	}
}
