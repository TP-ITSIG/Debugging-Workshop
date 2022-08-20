import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTests {
	@Test
	public void positiveNumbers() {
		assertEquals(6, Factorial.calculate(3));
		assertEquals(3628800, Factorial.calculate(10));
	}

	@Test
	public void zero() {
		assertEquals(1, Factorial.calculate(0));
	}

	@Test
	public void negativeNumbers() {
		assertEquals(1, Factorial.calculate(-1));
		assertEquals(1, Factorial.calculate(-10));
	}
}
