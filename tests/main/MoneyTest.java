package main;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = new Money(5);
		assertEquals(new Money(10), five.times(2));
		assertEquals(new Money(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		 assertTrue(new Money(5).equals( new Money(5) ));
		 assertFalse(new Money(5).equals( new Money(6) ));
	}

}
