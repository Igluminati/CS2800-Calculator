package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

class NumStackTest {

  private NumStack ns;
  
  @BeforeEach
  public void setup() {
    ns = new NumStack();
  }
  
  /**
   * Test 1 - Push a float to NumStack and check its size.
   *
   * 
   * @result 1 will be returned since the size of stack after one push is 1
   */
  @Test
  public void pushFloatTest() {
	  ns.push(3.0f);
	  assertEquals(ns.size(), 1);
  }
}