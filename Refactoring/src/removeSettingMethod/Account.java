package removeSettingMethod;

public class Account {
	private final String _id;
	
	public Account (String id) {
		_id = id;
		//initializeId(id);
	}
	
	/*private void initializeId(String id) {
		_id = "ZZ" + id;
	}*/
	
	public String getId() {
		return _id;
	}
}
