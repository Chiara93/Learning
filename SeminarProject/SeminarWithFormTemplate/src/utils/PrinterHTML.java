package utils;

import model.Seminar;
import model.Student;

public class PrinterHTML extends SeminarPrinter {

	@Override
	String header(Seminar seminar) {
		return "<html><head><title>" + seminar.getCourse().getName() + "</title></head><body>" +
				 "<div>" + seminar.getCourse().getName() + ":</div>" +
				 "<ul><li>" + seminar.getCourse().getDescription() + "</li>" +
					 "<li>" + seminar.getLocation() + "</li>" +
					 "<li>" + seminar.getDate().toString() +
					 "<li>" + seminar.getSeatsLeft() + "</li>" +
				 "</ul><div>partecipanti:</div>" + 
				 "<ul>";
	}

	@Override
	String eachStudent(Student student) {
		return "<li>" + student.getName() + student.getLastName() + "</li>";
	}

	@Override
	String footer() {
		return "</ul></body></html>";
	}

}
