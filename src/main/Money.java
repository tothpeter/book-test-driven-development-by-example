package main;

public class Money {
	private int amount;
	
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
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == amount && money.currency.equals(currency);
	}
}
