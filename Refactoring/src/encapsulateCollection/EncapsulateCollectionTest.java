package encapsulateCollection;

import static org.junit.Assert.*;

import org.junit.Test;

public class EncapsulateCollectionTest {
	
	@Test
	public void testAddAndRemove() {
		Person kent = new Person();
		Course maths = new Course("Maths", true);
		kent.addCourse(new Course("English", false));
		kent.addCourse(maths);
		
		assertEquals(2, kent.numberOfCourses());
		
		kent.addCourse(new Course("Refactoring methods", true));
		
		assertEquals(3, kent.numberOfCourses());
		
		kent.removeCourse(maths);
		
		assertEquals(2, kent.numberOfCourses());
	}
	
	@Test
	public void testAdvancedCourses() {
		Person kent = new Person();
		kent.addCourse(new Course("English", false));
		kent.addCourse(new Course("Refactoring methods", true));
		kent.addCourse(new Course("UML", true));
		
		assertEquals(2, kent.numberOfAdvancedCourses());
	}
}
