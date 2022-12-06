package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

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
	
	public boolean isEmpty() {
		return opstack.size() == 0;
	}
}