package com.app.search;

public class InvalidInputException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message, Exception e) {
        super(message, e);
    }
	
}
