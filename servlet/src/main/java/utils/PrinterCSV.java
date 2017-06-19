package utils;

import com.app.model.Seminar;
import com.app.model.Student;

public class PrinterCSV extends SeminarPrinter {
	
	@Override
	String header(Seminar seminar) {
		return quote(seminar.course().number()) + ";" +
				   quote(seminar.course().name()) + ";" +
				   quote(seminar.course().description()) + ";" +
				   quote(seminar.location()) + ";" +
				   quote(seminar.date().toString()) + ";" +
				   quote(seminar.seatsLeft()) + "\n";
	}

	@Override
	String eachStudent(Student student) {
		return quote(student.name()) + ";" + quote(student.lastName()) + "\n";
	}

	@Override
	String footer() {
		return "";
	}
	
	private String quote(Object field) {
		return "\"" + field + "\"";
	}
}
