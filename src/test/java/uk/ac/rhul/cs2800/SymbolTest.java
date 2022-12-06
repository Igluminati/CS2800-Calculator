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
  
/**
 * Test 3 
 * This test ensures that the getSymbol method in Symbol converts a String to type Symbol successfully.
 */
  @Test
  public void testGetSymbol() {
	  assertEquals(Symbol.LEFT_BRACKET, Symbol.getSymbol("("));
	  assertEquals(Symbol.RIGHT_BRACKET, Symbol.getSymbol(")"));
	  assertEquals(Symbol.MULTIPLY, Symbol.getSymbol("*"));
	  assertEquals(Symbol.DIVIDE, Symbol.getSymbol("/"));
	  assertEquals(Symbol.PLUS, Symbol.getSymbol("+"));
	  assertEquals(Symbol.MINUS, Symbol.getSymbol("-"));
  }
}