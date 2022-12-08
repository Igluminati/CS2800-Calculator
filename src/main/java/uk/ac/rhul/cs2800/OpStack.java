package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/** @author Igli Kristo zjac300 */

public class OpStack {

	Stack opstack;

	/*
	 * New instance of the Stack class is created
	 */
	public OpStack() {
		opstack = new Stack();
	}

	/**
	 * Adds a new item onto the stack.
	 * 
	 * @param symbol holds the value being pushed onto the stack
	 */
	public void push(Symbol symbol) {
		opstack.push(new Entry(symbol));
	}
	
	/**
	 * Calculate the current number of elements in the stack.
	 * 
	 * @return the size of the stack which is empty on creation
	 */
	public int size() {
		return opstack.size();
	}
	
	/**
	 * Removes the item at the top of the stack and returns it unless stack is empty.
	 * 
	 * @return the item at the top of the stack
	 */
	public Symbol pop() throws EmptyStackException {
		  if (opstack.size() == 0) {
		    throw new EmptyStackException();
		  }
		  try {
		    Symbol symbol = opstack.pop().getSymbol();
		    return symbol;
		    } catch (BadTypeException e) {
		      System.err.println(e);
		      return Symbol.INVALID;
		      }
		}
	
	/**
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return opstack.size() == 0;
	}
}