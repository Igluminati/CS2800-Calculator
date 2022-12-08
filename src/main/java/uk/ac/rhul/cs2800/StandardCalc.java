package uk.ac.rhul.cs2800;

/**
 * StandardCalc implements the 'evaluate()' abstract method in the 'Calculator' interface,
 * which is overridden to allow for expressions in both Infix and Postfix format 
 * to be evaluated.
 * 
 * 
 *  @author Igli Kristo zjac300 
 */

public class StandardCalc implements Calculator {

  OpStack values;
  RevPolishCalc rpCalc;
  
  /*
   * The constructor of the StandardCalc class which initialises a new opStack object
   * and RevPolishCalc object.
   */
  public StandardCalc() {
	  values = new OpStack();
	  rpCalc = new RevPolishCalc();
  }
  
  @Override
  public float evaluate(String expression) {
	  String postfixExpression = convertToPostfix(expression);
	  return rpCalc.evaluate(postfixExpression);
  }

  String convertToPostfix(String expression) {
	  String[] arrOfExpression = expression.split("\\s+");
	  String postfix = "";
	  Symbol currentSymbol = Symbol.INVALID;
	  Symbol currentPoppedSymbol = Symbol.INVALID;
	  
	  for (String current : arrOfExpression) {
		  if(current.matches("[0-9]+")) {
			  postfix = postfix + current.toString() + " ";
			  } 
		  else {
			  currentSymbol = Symbol.getSymbol(current);
			  
			  if(currentSymbol == Symbol.LEFT_BRACKET) {
				  values.push(currentSymbol);
			  }
			  else if (currentSymbol == Symbol.RIGHT_BRACKET) {
					  while((currentPoppedSymbol = values.pop()) != Symbol.LEFT_BRACKET) {
					  postfix = postfix + currentPoppedSymbol.toString() + " ";
					  }
			  }
			  else {
				  values.push(currentSymbol);
				  }
			  }
		  }
	  
	  while(!values.isEmpty() && (currentPoppedSymbol = values.pop()) != Symbol.INVALID) {
		  postfix += currentPoppedSymbol.toString() + " ";
		  }
		  
	  return postfix;
	  }	
}