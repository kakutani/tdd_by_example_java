public abstract class Money {
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;		
	}
	
	public boolean equals(Object object) {
		Money money = (Money)object;
		return (this.amount == money.amount
				&& this.getClass().equals(money.getClass()));
	}
	
	abstract Money times(int multiplier);
	
	String currency() {
		return currency;
	}
}
