package replaceTypeCodeWithState;

public abstract class EmployeeType {
	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	static EmployeeType newType(int code) {
		switch (code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		default:
			throw new IllegalArgumentException("Incorrect EmployeeCode");
		}
	}

	public abstract int getType();
}
