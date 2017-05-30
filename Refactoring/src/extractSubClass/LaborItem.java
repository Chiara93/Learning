package extractSubClass;

public class LaborItem extends JobItem{
	
	private Employee _employee;
	
	public LaborItem (int quantity, Employee employee) {
		super(0, quantity);
		_employee = employee;
	}
	
	public Employee getEmployee() {
		return _employee;
	}
	
	protected boolean isLabor() {
        return true;
    }
	
    public int getUnitPrice(){
        return  _employee.getRate();
    }
}
