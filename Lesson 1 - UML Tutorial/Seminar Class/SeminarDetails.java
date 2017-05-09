import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeminarDetails {

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		Seminar matematica = new Seminar(new Course("Matematica", 1, "Basi di matematica"), "Lugano", 20);
		Student chiara = new Student("Chiara", "Ferrario");
		matematica.enroll(chiara);
		matematica.enroll(new Student("Marco", "Rossi"));
		matematica.enroll(new Student("Mario", "Bianchi"));
		
		Seminar italiano = new Seminar(new Course("Italiano", 2, "Letteratura italiana"), "Manno", 20);
		italiano.enroll(new Student("Katia", "Ferrario"));
		
		Seminar tedesco = new Seminar(new Course("Tedesco", 3, "Grammatica tedesca"), "Chiasso", 15);
		tedesco.enroll(chiara);
		tedesco.enroll(new Student("Matteo", "Fattorini"));
		
		List<Seminar> seminars = Arrays.asList(matematica, italiano, tedesco);
		for (Seminar seminar : seminars) {
			System.out.println("Seminario: " + seminar.getName() + " - " + seminar.getLocation());
			System.out.println(seminar.getStudentList());
		}
	}
}
