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
  
  /*
   * Te
   *
   * 
   * 
   */
  @Test
  public void pushFloatTest() {
	  ns.push(new Entry(3.0f));
	  assertEquals(ns.size(), 1);
  }
}