package uk.ac.rhul.cs2800;

public class StrStack {

	Stack strstack;

	/*
	 * New instance of the Stack class is created
	 */
	public StrStack() {
		strstack = new Stack();
	}
	
	public void push(String string) {
		strstack.push(new Entry(string));
	}
	
	public int size() {
		return strstack.size();
	}

}