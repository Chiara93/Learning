package replaceTypeCodeWithClass;

public class BloodGroup {
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	
	private static final BloodGroup[] _groups = new BloodGroup[]{O, A, B, AB};
 	private int _code;
	
	public BloodGroup(int code) {
		_code = code;
	}
	
	public int getCode() {
		return _code;
	}
	
	public static BloodGroup code(int code) {
		return _groups[code];
	}
}
