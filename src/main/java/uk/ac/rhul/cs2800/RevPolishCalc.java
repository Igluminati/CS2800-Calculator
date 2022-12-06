package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * RevPolishCalc implements the 'evaluate()' abstract method in the 'Calculator' interface,
 * which is overriden to allow for expressions in Reverse Polish Calculation to be evaluated.
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
  
@Override
  public float evaluate(String expression) {
    // TODO Auto-generated method stub
    String[] arrOfExpression = expression.split(" ");

    for (String current : arrOfExpression) {
    	if(current.matches("[0-9]+")) {
    		float value = Float.parseFloat(current);
    		values.push(value);
    	}
    	else {
    		try {
    		Symbol symbol = Symbol.valueOf(current);
    		float second = values.pop();
    		float first = values.pop();
    		
    		float outcome = calculate(first, second, symbol);
    		
    		values.push(outcome);
    		
    		} catch (EmptyStackException e){
    			throw new IllegalArgumentException();
    			
    		} catch (NumberFormatException e) {
    	          // This means that the expression string contains something invalid. Throw an error.
    	          throw new IllegalArgumentException();
    		}
    	}
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
	  		if(second == 0) {
	  			throw new ArithmeticException("Cannot divide by zero!");
	  		}
	  		return first / second;
	  	case PLUS:
	  		return first + second;
	  	case MINUS:
	  		return first - second;
	  	default:
	  		return 0f;
	  }
	}
}
