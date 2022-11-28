package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class contains all the necessary methods for a stack to operate.
 * 
 * <p>
 * The methods are: size(), push(), pop() and top().
 * The stack class is used to represent a stack of entry values.
 * </p>
 * 
 * @author Igli Kristo zjac@300
 *
 */

public class Stack {

  private int size = 0;
  private ArrayList<Entry> entries = new ArrayList<Entry>();
  
  /**
   * Calculate the current number of elements in the stack.
   * 
   * @return the size of the stack which is empty on creation
   */
  public int size() {
    return entries.size();
  }

  /**
   * Adds a new item onto the stack.
   * 
   * @param e holds the value being pushed onto the stack
   */
  public void push(Entry e) {
    entries.add(e);
    size = size + 1;
  }

  /**
   * Removes the item at the top of the stack and returns it unless stack is empty.
   * 
   * @return the item at the top of the stack
   * 
   */
  public Entry pop() {
    if (entries.size() == 0) {
      throw new EmptyStackException();
    }
    
    Entry entry = entries.get(entries.size() - 1);
    entries.remove(entries.size() - 1);
    size = size - 1;
    return entry;
  }
  
  /**
   * Receives the item at the top of the stack and returns it unless stack is empty.
   * 
   * @return the item at the top of the stack
   * 
   */
  public Entry top() {
    if (entries.size() == 0) {
      throw new EmptyStackException();
    }
    
    Entry entry = entries.get(entries.size() - 1);
    return entry;
  }
}