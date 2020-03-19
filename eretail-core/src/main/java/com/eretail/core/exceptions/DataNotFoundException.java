/**
 * 
 */
package com.eretail.core.exceptions;

/**
 * @author sandeepknair
 *
 */
public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6593752127611533115L;
	
	/**
	 * Empty constructor
	 */
	public DataNotFoundException() {
		super();
	}

	/**
	 * Set message in the exception
	 * 
	 * @param message
	 */
	public DataNotFoundException(String message) {
        super(message);
    }
}
