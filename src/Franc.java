
public class Franc extends Money {
	Franc(int amount, String currency) {
		super(amount, currency);
	}

	String currency() {
		return currency;
	}
}
