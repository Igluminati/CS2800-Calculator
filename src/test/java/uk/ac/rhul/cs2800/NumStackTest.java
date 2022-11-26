package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** @author Igli Kristo zjac300 */

class NumStackTest {

  private NumStack ns;
  
  @BeforeEach
  public void setup() {
    ns = new NumStack();
  }
  
  // Test 1
  @Test
  public void emptyStackTest() {
    assertEquals(ns.size(), 0, "Test that a newly created stack is empty");
  }
}