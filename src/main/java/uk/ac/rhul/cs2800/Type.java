package uk.ac.rhul.cs2800;

/**
 * This enum class is a container for the type of entry to be used in calculator operations.
 * 
 * @author zjac300 Igli Kristo
 */

public enum Type {
  NUMBER("NUMBER"), SYMBOL("SYMBOL"), 
  STRING("STRING"), INVALID("INVALID");
  
  private String value;
  
  /**
   * Below contains a private enum constructor method for the Type class which holds a value.
   * 
   *  @param value is assigned to by an instance created by the tester
   */
  
  Type(String value) {
    this.value = value;
  }
  
  /**
   * Generic toString() method of enum class which returns the name of this enum constant.
   * 
   * @returns the type associated with the enum
   */

  @Override
  public String toString() {
    return value;
  }
}