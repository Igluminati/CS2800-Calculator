package uk.ac.rhul.cs2800;

public class CalcModel {
	
	Calculator revPolish;
	Calculator Standard;
	
	public CalcModel() {
		revPolish = new RevPolishCalc();
		Standard = new StandardCalc();
	}

	public float evaluate(String expression, boolean infix) {
		if (infix == true) {
			return Standard.evaluate(expression);
		}
		else {
			return revPolish.evaluate(expression);
		}
	}
}
