package uk.ac.rhul.cs2800;

/* Igli Kristo zjac300 */

public class CalcModel {
	
	Calculator revPolish;
	Calculator Standard;
	
	/* 
	 * Constructs two instances to allow expressions in both infix
	 * and postfix form to be evaluated.
	*/
	
	public CalcModel() {
		revPolish = new RevPolishCalc();
		Standard = new StandardCalc();
	}

	/**
	 * The evaluate method takes two arguments: The String expression
	 * and a boolean infix to indicate whether the expression is
	 * infix (true) or postfix (false)
	 * 
	 * @return the result of the evaluation
	 */
	
	public float evaluate(String expression, boolean infix) {
		if (infix == true) {
			return Standard.evaluate(expression);
		}
		else {
			return revPolish.evaluate(expression);
		}
	}
}
