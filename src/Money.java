public abstract class Money {
	static Money dollar(int amount) {
		return new Dollar(amount);
	}
	
	static Money franc(int amount) {
		return new Franc(amount);
	}
	
	protected int amount;
	
	public boolean equals(Object object) {
		Money money = (Money)object;
		return (this.amount == money.amount
				&& this.getClass().equals(money.getClass()));
	}
	
	public abstract Money times(int multiplier); 
}
