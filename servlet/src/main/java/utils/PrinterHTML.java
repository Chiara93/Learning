package utils;

import com.app.model.Seminar;
import com.app.model.Student;

public class PrinterHTML extends SeminarPrinter {

	@Override
	String header(Seminar seminar) {
		return "<html><head><title>" + seminar.course().name() + "</title></head><body>" +
				 "<div>" + seminar.course().name() + ":</div>" +
				 "<ul><li>" + seminar.course().description() + "</li>" +
					 "<li>" + seminar.location() + "</li>" +
					 "<li>" + seminar.date().toString() +
					 "<li>" + seminar.seatsLeft() + "</li>" +
				 "</ul><div>partecipanti:</div>" + 
				 "<ul>";
	}

	@Override
	String eachStudent(Student student) {
		return "<li>" + student.name() + " " + student.lastName() + "</li>";
	}

	@Override
	String footer() {
		return "</ul></body></html>";
	}

}
