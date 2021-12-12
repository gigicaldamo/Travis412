package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.minus(5, 3), 2);
		assertEquals(calc.multiply(6, 5), 30);
		assertEquals(calc.divide(40, 8), 5);
		assertEquals(calc.divide(40, 0), 0);
	}
}
