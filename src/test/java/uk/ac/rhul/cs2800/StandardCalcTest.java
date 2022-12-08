 package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *  @author Igli Kristo zjac300 
 */

public class StandardCalcTest {

  private StandardCalc StandardCalc;
  
  @BeforeEach
  void setup() {
    StandardCalc = new StandardCalc();
  }
  
  /*
   * Test 1
   * 
   * This tests the conversion of infix to postfix expressions which
   * is a major feature requested by the client in the handoutCalc.pdf.
   */
  
  @Test
  void ConversionTest() {
	  assertEquals("1 1 + ", StandardCalc.convertToPostfix("1 + 1"));
	  assertEquals("4 2 3 * + ", StandardCalc.convertToPostfix("4 + ( 2 * 3 )"));
	  assertEquals("20 6 9 + - 2 * ", StandardCalc.convertToPostfix(" ( 20 - ( 6 + 9 ) ) * 2"));
	  assertEquals("2 3 + 4 6 + * ", StandardCalc.convertToPostfix("( 2 + 3 ) * ( 4 + 6 )"));
	  }
  
  /*
   * Test 2
   * 
   * So long as a feature to convert infix to postfix exists, it would
   * be wise to pass the returned value of the convertToPostfix() method
   * to the calculate method in revPolishCalc as a way to remove unnecessary code.
   */
  
  @Test
  void testValidExpression() {
	  assertEquals(5, StandardCalc.evaluate("3 + 2"));
	  assertEquals(20, StandardCalc.evaluate("( 2 * ( 5 + 9 ) ) - 8"));
	  assertEquals(30, StandardCalc.evaluate("( 5 * ( 6 / 2 ) ) + 15"));
	  }
  
  /*
   * Test 3 
   * 
   * This test ensures that evaluate() successfully handles any exception
   * that may occur when the user inputs an expression
   * 
   */
  
  @Test
  void testInvalidExpression() {
	  assertThrows(IllegalArgumentException.class, () -> StandardCalc.evaluate("3 * - 2"));
	  assertThrows(IllegalArgumentException.class, () -> StandardCalc.evaluate(""));
	  assertThrows(IllegalArgumentException.class, () -> StandardCalc.evaluate("+"));
	  assertThrows(IllegalArgumentException.class, () -> StandardCalc.evaluate("3"));
	  }
}