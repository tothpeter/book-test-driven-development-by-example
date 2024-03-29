package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testReduceSum() {
		Sum sum = new Sum(Money.dollar(3), Money.dollar(3));

		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		
		assertEquals(Money.dollar(6), result );
	}
	
	@Test
	public void testIdentityRate() {		
		assertEquals(1, new Bank().rate("USD", "USD"));
	}
	
	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(5), "USD");
		
		assertEquals(Money.dollar(5), result);
	}
	
	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);

		Money result = bank.reduce(Money.franc(2), "USD");
		
		assertEquals(Money.dollar(1), result );
	}

}
