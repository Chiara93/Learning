package utils;

import com.app.model.Seminar;
import com.app.model.Student;

public class PrinterRaw extends SeminarPrinter{

	@Override
	String header(Seminar seminar) {
		return  "***************************************************************************************************************\n" +
				"Seminario di " + seminar.course().name() + " (" + seminar.course().id() + ") su " + seminar.course().description() + "\n" +
				"Il seminario si terra' presso " + seminar.location() + " e al momento ci sono ancora " + seminar.seatsLeft() + " posti disponibili\n" +
				"***************************************************************************************************************\n\n" +
				"Gli studenti attualmente iscritti sono: \n";
	}

	@Override
	String eachStudent(Student student) {
		return "** " + student.name() + " " + student.lastName() + " ** \n";
	}

	@Override
	String footer() {
		return "";
	}

}
