package de.hftstuttgart.simplecalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addingNumbers() {
		Calculator calc = new Calculator();
		assertEquals(20, calc.add(17, 3));
		assertEquals(14, calc.add(17, -3));
	}

}
