package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RevPolishCalcTest {

  private RevPolishCalc revPolishCalc;
  
  @BeforeEach
  void setup() {
    revPolishCalc = new RevPolishCalc();
  }
  
  /*
   * Test 1
   * 
   * This test ensures that the correct answer to an expression is given by the evaluate
   * method in the RevPolishCalc class when it is written in the appropriate format.
   */
  
  @Test
  void testValidExpression() {
    assertEquals(9, revPolishCalc.evaluate("3 2 1 + x"));
    assertEquals(20, revPolishCalc.evaluate("2 5 9 + x 8 -"));
  }
}