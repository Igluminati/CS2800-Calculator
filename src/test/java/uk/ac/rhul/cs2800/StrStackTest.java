package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

class StrStackTest {

  private StrStack ss;
  
  @BeforeEach
  public void setup() {
    ss = new StrStack();
  }
  
  /**
   * Test 1 - Push a symbol to OpStack and check its size.
   *
   * 
   * @result 1 will be returned since the size of stack after one push is 1
   */
  
  @Test
  public void pushStringTest() {
	  ss.push("Hello");
	  assertEquals(ss.size(), 1, "Tests that the size of the stack after being pushed is 1");
	  }
  
  /**
   * Test 2 - Push a String then pop it to StrStack and check its size
   * 
   * 
   * @result true to indicate that the String popped is the String pushed
   */
  
  @Test
  public void PushThenPop() throws EmptyStackException {
	  ss.push("Earth");
	  assertEquals(ss.pop(), "Earth", "The pop method should return the last String popped from the stack");
	  assertEquals(ss.size(), 0, "The size of the stack should be 0 after popping 'Earth' pushed onto the stack"); 
	  }
  
  /**
   * Test 3 - Tests that EmptyStackException is thrown by the pop() method when the stack is empty
   * 
   * 
   * @throws EmptyStackException 
   */
  
  @Test
  public void popEmptyStackTest() throws EmptyStackException {
	  assertThrows(EmptyStackException.class, () -> ss.pop());
	  }
  
  /**
   * Test 4 - Tests that isEmpty() method returns true when the stack is empty
   * 
   * The purpose of this method is to be consistent with the UML diagram
   * 
   * @return true if the stack size is 0
   */
  /*
  @Test
  public void emptyStackTest() {
	  assertTrue(os.isEmpty());
	  }
 */
}