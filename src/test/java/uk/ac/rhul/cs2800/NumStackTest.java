package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
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
	  assertEquals(ns.size(), 1, "Tests that the size of the stack after being pushed is 1");
  }
  
  /**
   * Test 2 - Push a float then pop it to NumStack and check its size
   * 
   * 
   * @result true to indicate that the float popped is the float pushed
   */
  @Test
  public void PushThenPop() throws EmptyStackException {
	  ns.push(5.0f);
	  assertEquals(ns.pop(), 5.0f, "The pop method should return the last value popped from the stack");
	  assertEquals(ns.size(), 0, "The size of the stack should be 0 after popping the integer 16 pushed onto the stack"); 
	  
  }
  
  /**
   * Test 3 - Tests that EmptyStackException is thrown by the pop() method when the stack is empty
   * 
   * 
   * @throws EmptyStackException 
   */
  
  @Test
  public void popEmptyStackTest() throws EmptyStackException {
	  assertThrows(EmptyStackException.class, () -> ns.pop());
	  
  }
  
  /**
   * Test 4 - Tests that isEmpty() method returns true when the stack is empty
   * 
   * The purpose of this method is to be consistent with the UML diagram
   * 
   * @return true if the stack size is 0
   */
  
  @Test
  public void emptyStackTest() {
	  assertTrue(ns.isEmpty());
  }
}