package de.hftstuttgart.simplecalc;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.sourceforge.marathon.javadriver.JavaDriver;

public class CalculatorAddTestIT {
	
	private Calculator calculator;
	private CalculatorWindow calcWin;
	private JavaDriver driver;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
		SwingUtilities.invokeLater(() -> {
			calcWin = new CalculatorWindow(calculator);
			calcWin.setVisible(true);
		});
		driver = new JavaDriver();
	}

	@After
	public void tearDown() throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeAndWait(() -> {
			calcWin.dispose();
	});
		driver.close();
}
	
	@Test
	public void testAddNumbers() {
//		Given: Joe has the calculator window open
		PageCalculator pageCalc = new PageCalculator(driver);
//		When: Joe types 23 into the first number and 19 in the second number and then clicks add
		pageCalc.setFirstNumber("23");
		pageCalc.setSecondNumber("19");
		pageCalc.add();
//		Then: The result field shows the sum of the numbers: 42
		assertEquals("42", pageCalc.getResult());
	}
	
}
