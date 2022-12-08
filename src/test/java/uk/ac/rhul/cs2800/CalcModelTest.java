package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Igli Kristo zjac300 */

public class CalcModelTest {
	
	CalcModel calcModel;
	
	@BeforeEach
	void createCalcModel() {
		calcModel = new CalcModel();
		}
	
	/*
	 * Test 1
	 * 
	 * 
	 * This test evaluates both infix and postfix expressions with a string argument
	 * and passes an argument true or false to indicate whether the expression is 
	 * infix or postfix respectively. Then, it tests that the answer to the expression
	 * is equal to the excepted answer.
	 */
	@Test
	void validExpressionTest() {
		assertEquals(10, calcModel.evaluate("5 + 5", true));
		assertEquals(25, calcModel.evaluate("5 5 *", false));
		assertEquals(20, calcModel.evaluate("2 * ( 5 + 5 )", true));
		assertEquals(32, calcModel.evaluate("12 1 2 + * 4 -", false));
	}
}