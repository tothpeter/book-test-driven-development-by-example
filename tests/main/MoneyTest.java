package main;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMultiplication() {
		Money five = new Money(5);
		Money product = five.times(2);
		assertEquals(10, product.amount);
	}

}
