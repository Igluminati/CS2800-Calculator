package uk.ac.rhul.cs2800;

/**
 * RevPolishCalc implements the 'evaluate()' abstract method in the 'Calculator' interface,
 * which is overriden to allow for expressions in Reverse Polish Calculation to be evaluated.
 * 
 * 
 *  @author Igli Kristo zjac300 
 */

public class RevPolishCalc implements Calculator {

  NumStack values;
  
  @Override
  public float evaluate(String expression) {
    // TODO Auto-generated method stub
    return 0;
  }

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
