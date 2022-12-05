 package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *  @author Igli Kristo zjac300 
 */

public class RevPolishCalcTest {

  private RevPolishCalc revPolishCalc;
  
  @BeforeEach
  void setup() {
    revPolishCalc = new RevPolishCalc();
  }
  
  
  /*
   * Test 1
   * 
   * Reverse Polish Calculation evaluates two numStack values at once and therefore
   * this must be tested through a new method called calculate() to ensure every
   * step in the evaluate() method is correct
   */
  
  @Test
  void CalculationTest() {
	  assertEquals(15, revPolishCalc.calculate(10f, 5f, Symbol.PLUS));
	  assertEquals(10, revPolishCalc.calculate(200, 20, Symbol.DIVIDE));
  }
  
  /*
   * Test 2
   * 
   * This test ensures that the correct answer to an expression is given by the evaluate
   * method in the RevPolishCalc class when it is written in the appropriate format.
  
  @Test
  void testValidExpression() {
    assertEquals(9, revPolishCalc.evaluate("3 2 1 + x"));
    assertEquals(20, revPolishCalc.evaluate("2 5 9 + x 8 -"));
  }
  */
}