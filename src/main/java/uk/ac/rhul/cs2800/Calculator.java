package uk.ac.rhul.cs2800;

/**
 * Calculator is an interface which allows for the calculation of both Reverse
 * Polish and Infix String Expressions.
 * 
 * 
 * @author Igli Kristo zjac300
 *
 */

public interface Calculator {
	
	 /**
	   * Get the evaluation of an arithmetic expression String.
	   *
	   * @param expression which is the String to be calculated.
	   * @return the result of the evaluation.
	   */
	
	public float evaluate(String expression);
}
