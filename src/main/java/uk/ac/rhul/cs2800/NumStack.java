package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/** @author Igli Kristo zjac300 */

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

	public float pop() throws EmptyStackException {
	  if (numstack.size() == 0) {
	    throw new EmptyStackException();
	  }
	  try {
	    float value = numstack.pop().getValue();
	    return value;
	    } catch (BadTypeException e) {
	      System.err.println(e);
	      return 0;
	      }
	}

	public boolean isEmpty() {
		return numstack.size() == 0;
	}
	
	
}