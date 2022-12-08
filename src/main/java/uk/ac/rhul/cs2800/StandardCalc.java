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
  
  /**
   * So long as a feature to convert infix to postfix exists, it would
   * be wise to pass the returned value of the convertToPostfix() method
   * to the calculate method in revPolishCalc as a way to remove unnecessary code.
   * 
   * @return the evaluated expression after conversion to postfix
   */
  @Override
  public float evaluate(String expression) {
	  String postfixExpression = convertToPostfix(expression);
	  return rpCalc.evaluate(postfixExpression);
  }


  /**
   * Converts infix expressions into postfix form so that it can be
   * evaluated through the instance of RevPolishCalc class
   * 
   * @return postfix expression
   */
  String convertToPostfix(String expression) {
	  String[] arrOfExpression = expression.split("\\s+");
	  String postfix = "";
	  Symbol currentSymbol = Symbol.INVALID;
	  Symbol currentPoppedSymbol = Symbol.INVALID;
	  
	  for (String current : arrOfExpression) {
		// Checks if the current element is numeric
		  if(current.matches("[0-9]+")) {
			  // Adds numeric element to postfix expression
			  postfix = postfix + current.toString() + " ";
			  } 
		  else {
			  currentSymbol = Symbol.getSymbol(current);
			  
			  // Code block ensures that left and right brackets aren't added to postfix expression
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
	  
	  /* All remaining elements that are popped from the OpStack are added to the
	   * postfix expression so long as they are not invalid symbols
	   */
	  while(!values.isEmpty() && (currentPoppedSymbol = values.pop()) != Symbol.INVALID) {
		  postfix += currentPoppedSymbol.toString() + " ";
		  }
		  
	  return postfix;
	  }	
}