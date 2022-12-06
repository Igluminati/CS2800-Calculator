package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

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
}