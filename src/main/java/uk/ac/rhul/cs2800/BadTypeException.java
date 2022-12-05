package uk.ac.rhul.cs2800;

/**
 * Custom Exception class for handling cases when the incorrect type is given.
 * 
 *  
 *  @author Igli Kristo zjac300 
 * 
 */


@SuppressWarnings("serial")
public class BadTypeException extends Exception {
  
  /**
   * A new instance of BadTypeException is created and message is passed through Exception class
   * 
   * @param errorMessage printed out for the user in the case the incorrect type is given.
   */
  
  public BadTypeException(String errorMessage) {
    super(errorMessage);
  }
}
