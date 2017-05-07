
public class Course {
	private String _courseName;
	private int _courseNumber;
	private String _courseDescription;
	
	public Course(final String courseName, final int courseNumber, final String courseDescription) {
		_courseName = courseName;
		_courseNumber = courseNumber;
		_courseDescription = courseDescription;
	}

	public String getName() {
		return _courseName;
	}

	public int getNumber() {
		return _courseNumber;
	}

	public String getDescription() {
		return _courseDescription;
	}	
}
