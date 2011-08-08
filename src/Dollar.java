public class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	String currency() {
		return currency;
	}
	

}
