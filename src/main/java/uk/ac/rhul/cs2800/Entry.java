package uk.ac.rhul.cs2800;

/**
 * The Entry class is a container class for either a Float, a String or a Symbol.
 * 
 * <p>
 * The class has getter and constructor methods for each contained type.
 * Each getters throws an exception if it does not match the constructor.
 * </p>
 * 
 * @author steak
 *
 */

public class Entry {
  
  private float number;
  private Symbol other;
  private String str;
  private Type type;
  
  /**
   * Creates a new instance of entry with a number held inside it.
   * 
   * @param value is the number created by the tester
   */
  
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER;
  }

  /**
   * Creates a new instance of entry with a symbol held inside it.
   * 
   * 
   * @param which is the symbol created by the tester
   */
  public Entry(Symbol which) {
    this.other = which;
    this.type = Type.SYMBOL;
  }

  /**
   * Creates a new instance of entry with a string held inside it.
   * 
   * @param string is the string created by the tester
   */
  public Entry(String string) {
    this.str = string;
    this.type = Type.STRING;
  }
  
  /**
   * Gets the type of the specified entry.
   * 
   * @return type of entry indicated in each entry constructor instance
   */
  public Type getType() {
    return this.type;
  }

  /**
   * Gets the number value of the entry.
   * 
   * @return number
   */
  
  public float getValue() throws Exception {
    if (this.type != Type.NUMBER) {
      throw new Exception("The type must be a NUMBER");
    }
    return number;
  }

  /**
   * Gets the symbol value of the entry.
   * 
   * @return other
   */
  public Symbol getSymbol() throws Exception {
    if (this.type != Type.SYMBOL) {
      throw new Exception("The type must be a SYMBOL");
    }
    return other;
  }

  /**
   * Gets the string value of the entry.
   * 
   * @return str
   */
  public String getString() throws Exception {
    if (this.type != Type.STRING) {
      throw new Exception("The type must be a STRING");
    }
    return str;
  }
}