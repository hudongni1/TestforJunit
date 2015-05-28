package testForCalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
//		fail("Not yet implemented");
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	@Test
	public void testMultiply() {
//		fail("Not yet implemented");		
		calculator.add(2);
		calculator.multiply(3);
		assertEquals(6, calculator.getResult());
	}

	@Test
	public void testDivide() {
//		fail("Not yet implemented");
		calculator.add(10);
		calculator.divide(2);
		assertEquals(5, calculator.getResult());
	}

}
