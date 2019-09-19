/**
 * 
 */
package com.eretail.core.exceptions;

/**
 * @author sandeepknair
 *
 */
public class InvalidArgumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 548072263857575400L;

	/**
	 * Empty constructor
	 */
	public InvalidArgumentException() {
		super();
	}

	/**
	 * Set message in the exception
	 * 
	 * @param message
	 */
	public InvalidArgumentException(String message) {
		super(message);
	}

	
}
