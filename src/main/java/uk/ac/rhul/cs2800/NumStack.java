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
	
	/**
	 * Adds a new item onto the stack.
	 * 
	 * @param value holds the value being pushed onto the stack
	 */
	public void push(float value) {
		numstack.push(new Entry(value));
	}

	/**
	 * Calculate the current number of elements in the stack.
	 * 
	 * @return the size of the stack which is empty on creation
	 */
	public int size() {
		return numstack.size();
	}
	
	/**
	 * Removes the item at the top of the stack and returns it unless stack is empty.
	 * 
	 * @return the item at the top of the stack
	 */
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

	/**
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return numstack.size() == 0;
	}
	
	
}