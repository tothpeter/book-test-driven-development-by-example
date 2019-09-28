package main;

public class Bank {
	public Bank() {
	}

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public void addRate(String from, String to, int rate) {
		
	}
	
	public int rate(String from, String to) {
		return from.equals("CHF") ? 2 : 1;
	}
}
