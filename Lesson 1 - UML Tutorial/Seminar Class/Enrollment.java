
public class Enrollment {
	private Student _student;
	
	public Enrollment(final Student student) {
		_student = student;
	}
	
	public String getInfo() {
		return _student.getInfo();
	}
}
