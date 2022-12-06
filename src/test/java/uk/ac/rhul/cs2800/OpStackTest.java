package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

class OpStackTest {

  private OpStack os;
  
  @BeforeEach
  public void setup() {
    os = new OpStack();
  }
  
  /**
   * Test 1 - Push a symbol to OpStack and check its size.
   *
   * 
   * @result 1 will be returned since the size of stack after one push is 1
   */
  
  @Test
  public void pushSymbolTest() {
	  os.push(Symbol.LEFT_BRACKET);
	  assertEquals(os.size(), 1, "Tests that the size of the stack after being pushed is 1");
	  }
  
  /**
   * Test 2 - Push a smybol then pop it to OpStack and check its size
   * 
   * 
   * @result true to indicate that the smybol popped is the symbol pushed
   */
  
  @Test
  public void PushThenPop() throws EmptyStackException {
	  os.push(Symbol.DIVIDE);
	  assertEquals(os.pop(), Symbol.DIVIDE, "The pop method should return the last symbol popped from the stack");
	  assertEquals(os.size(), 0, "The size of the stack should be 0 after popping the Symbol.DIVIDE pushed onto the stack"); 
	  }
  
  /**
   * Test 3 - Tests that EmptyStackException is thrown by the pop() method when the stack is empty
   * 
   * 
   * @throws EmptyStackException 
   */
  
  @Test
  public void popEmptyStackTest() throws EmptyStackException {
	  assertThrows(EmptyStackException.class, () -> os.pop());
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