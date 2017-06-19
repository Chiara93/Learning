package utils;

import com.app.model.Seminar;
import com.app.model.Student;

public abstract class SeminarPrinter {

	public String print(Seminar seminar) {
		String result = "";
		
		result += header(seminar);
		
		for (Student student : seminar.studentList()) {
			result += eachStudent(student);
		}
		
		result += footer();
		return result;
	}
	
	abstract String header(Seminar seminar);
	abstract String eachStudent(Student student);
	abstract String footer();
}
