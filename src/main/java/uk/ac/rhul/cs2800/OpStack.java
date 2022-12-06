package uk.ac.rhul.cs2800;

public class OpStack {

	Stack opstack;

	/*
	 * New instance of the Stack class is created
	 */
	public OpStack() {
		opstack = new Stack();
	}
	
	public void push(Symbol symbol) {
		opstack.push(new Entry(symbol));
	}
	
	public int size() {
		return opstack.size();
	}
}