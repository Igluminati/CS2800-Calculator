package uk.ac.rhul.cs2800;

/**
 * This enum class is a container for non-numeric symbols to be used in calculator operations.
 * 
 * @author zjac300 Igli Kristo
 */

public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"),
  MULTIPLY("x"), DIVIDE("/"), PLUS("+"),
  MINUS("-"), INVALID("#");
  
  private String value;
  
  /**
   * Below contains a private enum constructor method for the Symbol class which holds a value.
   * 
   * @param value is assigned to by an instance created by the tester
   */
  
  Symbol(String value) {
    this.value = value;
  }
  
  /**
   * Generic toString() method of enum class which returns the name of this enum constant.
   * 
   * @returns the symbol associated with the enum
   */

  @Override
  public String toString() {
    return value;
  }

  public static Symbol getSymbol(String currentSymbol) {
	  switch (currentSymbol) {
	  case "(":
		  return LEFT_BRACKET;
	  case ")":
		  return RIGHT_BRACKET;
      case "x":
          return MULTIPLY;
      case "/":
          return DIVIDE;
      case "+":
          return PLUS;
      case "-":
          return MINUS;
      default:
          return INVALID;
   }
}
}