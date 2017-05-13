package utils;

import model.Seminar;
import model.Student;

public abstract class SeminarPrinter {

	public String print(Seminar seminar) {
		String result = "";
		
		result += header(seminar);
		
		for (Student student : seminar.getStudentList()) {
			result += eachStudent(student);
		}
		
		result += footer();
		return result;
	}
	
	abstract String header(Seminar seminar);
	abstract String eachStudent(Student student);
	abstract String footer();
}
