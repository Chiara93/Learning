package profile;

public class Profile {


	public int sumTo(int limit) {
	
		int sum = 0;
		
		//Calc c = new Calc();
		for (int value = 0; value <= limit; value++) {
			//sum = c.accumulate(sum, value);
			sum += value;
		}
		
		return sum;
	}
}
