package encapsulateCollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person {
	private final Set _courses = new HashSet<>();

	public Set getCourses() {
		return Collections.unmodifiableSet(_courses);
	}

	public void addCourse (Course arg) {
		_courses.add(arg);
	}

	public void removeCourse (Course arg) {
		_courses.remove(arg);
	}

	public void initializeCourses(Set arg) {
		//Assert.isTrue(_courses.isEmpty());
		_courses.addAll(arg);
	}

	int numberOfAdvancedCourses() {
		Iterator iter = getCourses().iterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) count ++;
		}
		return count;
	}

	public int numberOfCourses() {
		return _courses.size();
	}
}
