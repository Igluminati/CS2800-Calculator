package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

public class TypeTest {

//Test 1
  @Test
  public void numberToStringTest() {
    assertEquals("NUMBER", Type.NUMBER.toString(),
        "Checks if the toString() method works and returns the type: NUMBER");
  }
  
//Test 2
  @Test
  public void symbolToStringTest() {
    assertEquals("SYMBOL", Type.SYMBOL.toString(),
        "Checks if the toString() method works and returns the type: SYMBOL");
  }
  
//Test 3
  @Test
  public void stringToStringTest() {
    assertEquals("STRING", Type.STRING.toString(),
        "Checks if the toString() method works and returns the type: STRING");
  }
  
//Test 4
  @Test
  public void invalidToStringTest() {
    assertEquals("INVALID", Type.INVALID.toString(),
        "Checks if the toString() method works and returns the type: INVALID");
  }
  
}