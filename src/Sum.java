
class Sum implements Expression {
	private Money augend;
	private Money addend;

	Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(String to) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, to);
	}
}
