package model;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Seminar {
	private Course _course;
	private String _location;
	private Date _date;
	private int _seatsLeft;
	private List<Student> _students = new ArrayList<>();
	
	public Seminar(final Course course, final String location, final Date date, final int seatsLeft) {
		_course = course;
		_location = location;
		_date = date;
		_seatsLeft = seatsLeft;
	}
	
	public Course getCourse() {
		return _course;
	}
	
	public String getLocation() {
		return _location;
	}
	
	public Date getDate() {
		return _date;
	}
	
	public int getSeatsLeft() {
		return _seatsLeft;
	}
	
	public List<Student> getStudentList() {
		return _students;
	}
	
	public void enroll(Student student) {
		_students.add(student);
	}
}
