package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

class StackTest {

  private Stack cs;
  
  @BeforeEach
  public void setup() {
    cs = new Stack();
  }
  
  // Test 1
  @Test
  public void emptyStackTest() {
    assertEquals(cs.size(), 0, "Test that a newly created stack is empty");
  }
  
  //Test 2
  @Test
  public void pushTest() {
    cs.push(new Entry(2));
    assertEquals(cs.size(), 1, "Size of stack should be 1 after pushing one item onto the stack");
  }
  
  //Test 3
  @Test
  public void pushThenPop() throws Exception {
    cs.push(new Entry(16));
    assertEquals(cs.pop().getValue(), 16, "The pop method should return the last value popped from the stack");
    assertEquals(cs.size(), 0, "The size of the stack should be 0 after popping the integer 16 pushed onto the stack"); 
    }
  
  //Test 4  
  @Test
  public void popEmptyStackTest() {
    assertThrows(EmptyStackException.class, () -> cs.pop(), "Popping on an empty stack should throw an empty stack exception");  
    }
  
  //Test 5
  @Test
  public void pushThriceThenPopThrice() throws Exception {
    cs.push(new Entry(4));
    cs.push(new Entry(8));
    cs.push(new Entry(12));
    assertEquals(cs.size(), 3, "Size of stack should be 3 after pushing three items onto the stack");
    assertEquals(cs.pop().getValue(), 12, "Pushing thrice then popping once should return the third thing pushed");
    assertEquals(cs.pop().getValue(), 8, "Pushing thrice then popping twice should return the second thing pushed");
    assertEquals(cs.pop().getValue(), 4, "Pushing thrice then popping thrice should return the first thing pushed");
    assertThrows(EmptyStackException.class, () -> cs.pop(), "pushing thrice then popping quadrice should throw an empty stack exception");
  }
  
  //Test 6
  @Test
  public void topTest() throws Exception {
    cs.push(new Entry(16));
    cs.push(new Entry("("));
    cs.push(new Entry(20));
    assertEquals(cs.top().getValue(), 20, "Using the top() method should return the top value of the stack");
  }
  
  //Test 7
  @Test
  public void topEmptyStackTest() {
    assertThrows(EmptyStackException.class, () -> cs.top(), "Using the top() method on an empty stack should throw an empty stack exception");
  }
  
  //Test 8
  @Test
  public void pushOneHundredTimes() {
    for(int i = 0; i < 100; i++) {
      cs.push(new Entry(i));
      assertEquals(cs.size(), (i+1), "The size of the stack should become larger");
    }
  }
  
  /** Test 9
   * 
   * This test will be utilised to change the ArrayList of Integers into an ArrayList of Entry objects using Test Driven Development.
   * 
   * @throws Exception if the entry type is not a symbol
   */
  @Test
  public void pushAndPopVariousEntries() throws Exception {
    cs.push(new Entry("*"));
    cs.push(new Entry(5));
    cs.push(new Entry(Symbol.DIVIDE));
    assertEquals("/", cs.top().getSymbol().toString());
  }
  
}