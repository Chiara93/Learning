package encapsulateCollection;

public class Course {
	private final String _name;
	private final boolean _isAdvanced;
	
	public Course (String name, boolean isAdvanced) {
		_name = name;
		_isAdvanced = isAdvanced;
	}
	
	public boolean isAdvanced() {
		return _isAdvanced;
	}
	
	public String getName() {
		return _name;
	}
}
