package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * RevPolishCalc implements the 'evaluate()' abstract method in the 'Calculator' interface,
 * which is overridden to allow for expressions in Reverse Polish Calculation to be evaluated.
 * 
 * 
 *  @author Igli Kristo zjac300 
 */

public class RevPolishCalc implements Calculator {

  NumStack values;
  
  /*
   * The constructor of the RevPolishCalc class which initialised a new numStack object.
   */
  public RevPolishCalc() {
	  values = new NumStack();
  }
  
  /**
   * Creates an array of string values by splitting the whitespace in the expression string.
   * Each element is then evaluated to determine whether it is a float, symbol or other
   * (in which case: an exception is thrown)
   * 
   * @throws IllegalArgumentException if expression isn't in the correct form
   * @return the calculated answer of an expression in postfix form 
   */
  @Override
  public float evaluate(String expression) {
    // TODO Auto-generated method stub
    String[] arrOfExpression = expression.split("\\s+");
    int floatCount = 0;
    int symbolCount = 0;
    for (String current : arrOfExpression) {
    	// Checks if the current element is numeric
    	if(current.matches("[0-9]+")) {
    		float value = Float.parseFloat(current);
    		values.push(value);
    		floatCount = floatCount + 1;
    	}
    	else {
	    		try {
	    			// Tries to parse current element as a symbol enum
	    			Symbol symbol = Symbol.getSymbol(current);
	    			symbolCount = symbolCount + 1;
	    			float second = values.pop();
	    			float first = values.pop();
	    			float outcome = calculate(first, second, symbol);
	    		
	    			values.push(outcome);
	    		
	    			} catch (EmptyStackException e){
	    				throw new IllegalArgumentException("Stack is empty!");	
	    			} catch (NumberFormatException e) {
	    				throw new IllegalArgumentException("The value is not able to be converted!");
	    			} 
    			}
    	}
    	// If there is a single float or there are less floats than symbols then the operation cannot be performed
    	if(floatCount == 1 || floatCount <= symbolCount) {
    		throw new IllegalArgumentException("Argument is unbalanced");
    	}
    return values.pop();
  }

/**
   * Performs a calculation (using an operator in the Symbol enum class)
   * of the first and second numStack values, that are returned using the pop() method.
   * 
   * @param first operand
   * @param second operand
   * @param symbol operator
   * @throws ArithmeticException if second operand is equal to 0
   * @return the result of the calculation of the two float values
   */
  
  public float calculate(float first, float second, Symbol symbol) {
	  switch (symbol) {
	  	case MULTIPLY:
	  		return (float) first * second;
	  	case DIVIDE:
	  		if(second != 0) {
	  			return (float) first / second;
	  		}
	  		else {
	  			throw new ArithmeticException("Cannot divide by zero!"); 
	  			}  		
	  	case PLUS:
	  		return (float) first + second;
	  	case MINUS:
	  		return (float) first - second;
	  	default:
	  		return 0f;
	  }
	}
}
