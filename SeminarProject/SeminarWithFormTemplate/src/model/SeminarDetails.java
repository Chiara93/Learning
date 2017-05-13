package model;

import java.util.Date;

import utils.PrintFactory;

public class SeminarDetails {

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		Seminar matematica = new Seminar(new Course("Matematica", 1, "Basi di matematica"), "Lugano", new Date(117, 3, 21), 20);
		Student chiara = new Student("Chiara", "Ferrario");
		matematica.enroll(chiara);
		matematica.enroll(new Student("Marco", "Rossi"));
		matematica.enroll(new Student("Mario", "Bianchi"));
		
		Seminar italiano = new Seminar(new Course("Italiano", 2, "Letteratura italiana"), "Manno", new Date(116, 10, 1), 20);
		italiano.enroll(new Student("Katia", "Ferrario"));
		
		Seminar tedesco = new Seminar(new Course("Tedesco", 3, "Grammatica tedesca"), "Chiasso", new Date(117, 4, 13), 15);
		tedesco.enroll(chiara);
		tedesco.enroll(new Student("Matteo", "Fattorini"));
		
		System.out.println(new PrintFactory().printHtml(matematica));
		System.out.println(new PrintFactory().printCsv(italiano));
		System.out.println(new PrintFactory().printCsv(tedesco));
	}
}
