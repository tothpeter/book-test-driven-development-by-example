package main;

public class Money {
	int amount;

	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier);
	}
}
