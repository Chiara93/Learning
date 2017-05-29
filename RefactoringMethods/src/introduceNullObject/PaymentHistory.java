package introduceNullObject;

public class PaymentHistory {
	
	public int getWeeksDelinquentInLastYear()
	{
		return 10;
	}

	public static PaymentHistory newNull() {
		return new NullPaymentHistory();
	}
}
