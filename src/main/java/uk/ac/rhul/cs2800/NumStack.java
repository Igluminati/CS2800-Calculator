package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

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

	public float pop() throws Exception {
		try {
			return numstack.pop().getValue();
		} catch (Exception e) {
			System.err.println(e);
		}
		return 0f;
	}
	
	
}