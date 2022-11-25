package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

/** @author Igli Kristo zjac300 */

public class EntryTest {
  
  Entry floatEntry;
  Entry symbolEntry;
  Entry stringEntry;
  
  /** Test 1
   * 
   * Tests the constructor and getValue() method for the correct value.
   * 
   * @return number if type is a float
   * @throws Exception in the event that the type of the entry is different to that of the value in the getter.
   */
  @Test
  public void getValueTest() throws Exception {
    this.floatEntry = new Entry(5.0f);
    assertEquals(5.0, floatEntry.getValue(), "Assesses if the float is constructed and can be retreived from getter");
  }
  
  /** Test 2
   * 
   * Tests the constructor and getSymbol() method for the correct symbol.
   * 
   * @return value if it is a symbol
   * @throws Exception in the event that the type of the entry is different to that of the value in the getter.
   */
  @Test
  public void getSymbolTest() throws Exception {
    this.symbolEntry = new Entry(Symbol.DIVIDE);
    assertEquals(Symbol.DIVIDE, symbolEntry.getSymbol(), "Assesses if the symbol is constructed and can be retreived from getter");
  }
  
  /** Test 3
   * 
   * Tests the constructor and getString() method for the correct symbol.
   * 
   * @return text if it is a string
   * @throws Exception in the event that the type of the entry is different to that of the value in the getter. 
   */
  @Test
  public void getStringTest() throws Exception {
    this.stringEntry = new Entry("Hello");
    assertEquals("Hello", stringEntry.getString(), "Assesses if the string is constructed and can be retreived from getter");
  }
  
  /** Test 4
   * 
   * Calls getType() method to get the type of each constructed entry.
   * 
   * @return type of entry
   */
  @Test
  public void getTypeTest() {
    this.floatEntry = new Entry(5.0f);
    this.symbolEntry = new Entry(Symbol.DIVIDE);
    this.stringEntry = new Entry("Hello");
    assertEquals(Type.NUMBER, floatEntry.getType());
    assertEquals(Type.SYMBOL, symbolEntry.getType());
    assertEquals(Type.STRING, stringEntry.getType());
  }
  
  /** Test 5
   * 
   * Test for exceptions in getter methods if the types do not match.
   * 
   * This test constructs Entry instances of the types float, symbol and string.
   * The test then attempts to call getter methods with different types to the instances constructed.
   * 
   * @throws Exception when getter type and constructed entry instance type are different.
   */
  
  @Test
  public void wrongTypeExceptionTests() throws Exception {
    this.floatEntry = new Entry(5.0f);
    this.symbolEntry = new Entry(Symbol.DIVIDE);
    this.stringEntry = new Entry("Hello");
    assertThrows(Exception.class, () -> symbolEntry.getValue());
    assertThrows(Exception.class, () -> floatEntry.getString());
    assertThrows(Exception.class, () -> stringEntry.getSymbol());
  }
  
  /** Test 6
   * 
   * Tests if any two entries are considered equal if and only if they have the same type and value.
   * 
   * @return True if two entries are equal
   * @throws Exception 
   */
  @Test
  public void equalityTest() throws Exception {
    Entry currentSymbolEntry = new Entry(Symbol.MULTIPLY);
    this.symbolEntry = new Entry(Symbol.MULTIPLY);
    assertTrue((this.symbolEntry.getSymbol().toString()).equals(currentSymbolEntry.getSymbol().toString()));
  }
}