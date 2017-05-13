import java.util.ArrayList;

public class Seminar {
	private Course _course;
	private String _location;
	private int _seatsLeft;
	private ArrayList<Student> _students = new ArrayList<>();
	
	public Seminar(final Course course, final String location, final int seatsLeft) {
		_course = course;
		_location = location;
		_seatsLeft = seatsLeft;
	}
	
	public String getLocation() {
		return _location;
	}
	
	public int getSeatsLeft() {
		return _seatsLeft;
	}
	
	public String getStudentList() {
		String studentList = "";
		
		for (Student student : _students) {
			studentList = studentList + student.getInfo() + "\n";
		}
		return studentList;
	}
	
	public String getName() {
		return _course.getName() + "(" + _course.getNumber() + ")";
	}
	
	public String getDescription() {
		return _course.getDescription();
	}
	
	public void enroll(Student student) {
		_students.add(student);
	}
}
