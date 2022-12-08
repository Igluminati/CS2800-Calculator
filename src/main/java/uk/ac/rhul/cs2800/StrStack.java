package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;
import java.util.function.BooleanSupplier;

/** @author Igli Kristo zjac300 */

public class StrStack {

	Stack strstack;

	/*
	 * New instance of the Stack class is created
	 */
	public StrStack() {
		strstack = new Stack();
	}

	/**
	 * Adds a new item onto the stack.
	 * 
	 * @param string holds the value being pushed onto the stack
	 */
	public void push(String string) {
		strstack.push(new Entry(string));
	}
	
	/**
	 * Calculate the current number of elements in the stack.
	 * 
	 * @return the size of the stack which is empty on creation
	 */
	public int size() {
		return strstack.size();
	}

	/**
	 * Removes the item at the top of the stack and returns it unless stack is empty.
	 * 
	 * @return the item at the top of the stack
	 */
	public String pop() throws EmptyStackException {
		  if (strstack.size() == 0) {
		    throw new EmptyStackException();
		  }
		  try {
		    String string = strstack.pop().getString();
		    return string;
		    } catch (BadTypeException e) {
		      System.err.println(e);
		      return "";
		      }
		}

	/**
	 * @return true if the stack is empty
	 */
	public boolean isEmpty() {
		return strstack.size() == 0;
	}
}