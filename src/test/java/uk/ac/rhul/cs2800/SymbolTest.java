package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

public class SymbolTest {
  
// Test 1
  @Test
  public void multiplyToStringTest() {
    assertEquals("*", Symbol.MULTIPLY.toString(),
        "Checks if the toString() method works and returns the correct symbol");
  }
  
// Test 2
  @Test
  public void divideToStringTest() {
    assertEquals("/", Symbol.DIVIDE.toString(),
        "Checks if the toString() method works and returns the correct symbol");
  }
}