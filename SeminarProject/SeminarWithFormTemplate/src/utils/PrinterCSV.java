package utils;

import model.Seminar;
import model.Student;

public class PrinterCSV extends SeminarPrinter {
	
	@Override
	String header(Seminar seminar) {
		return quote(seminar.getCourse().getNumber()) + ";" +
				   quote(seminar.getCourse().getName()) + ";" +
				   quote(seminar.getCourse().getDescription()) + ";" +
				   quote(seminar.getLocation()) + ";" +
				   quote(seminar.getDate().toString()) + ";" +
				   quote(seminar.getSeatsLeft()) + "\n";
	}

	@Override
	String eachStudent(Student student) {
		return quote(student.getName()) + ";" + quote(student.getLastName()) + "\n";
	}

	@Override
	String footer() {
		return "";
	}
	
	private String quote(Object field) {
		return "\"" + field + "\"";
	}
}
