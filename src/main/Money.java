package main;

public class Money implements Expression {
	int amount;
	
	String currency;
	
	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == amount && money.currency.equals(currency);
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	@Override
	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
	
	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
