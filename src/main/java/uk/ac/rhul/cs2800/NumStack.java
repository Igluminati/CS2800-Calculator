package uk.ac.rhul.cs2800;

public class NumStack {
	
	Stack numstack;

	/*
	 * New instance of the Stack class is created
	 */
	public NumStack() {
		numstack = new Stack();
	}
	
	public void push(float value) {
		numstack.push(new Entry(value));
	}

	public int size() {
		return numstack.size();
	}
	
	
}