
public class Franc extends Money {
	Franc(int amount, String currency) {
		super(amount, currency);
	}

	public Money times(int multiplier) {
		return Money.franc(amount * multiplier);
	}

	String currency() {
		return currency;
	}
}
