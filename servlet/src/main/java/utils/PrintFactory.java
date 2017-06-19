package utils;

import com.app.model.Seminar;

public class PrintFactory {

	public String printHtml(Seminar seminar) {
		return new PrinterHTML().print(seminar);
	}
	
	public String printCsv(Seminar seminar) {
		return new PrinterCSV().print(seminar);
	}
}
