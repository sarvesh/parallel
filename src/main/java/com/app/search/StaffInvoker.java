package com.app.search;

public class StaffInvoker<R> implements AppraiserInvoker<R> {
	
	
	private Object requestObj = null;

	public StaffInvoker(final Object requestObj) {
		this.requestObj = requestObj;
	}


	public boolean isValidRequest() throws InvalidInputException {
		
		
		return false;
		
	}

	

	
	/**
	 * 
	 * 
	 * All the life cycle methods
	 * 
	 */
	
	public void init() throws InitializationFailedException {
		
		
		//rest cliebct 
		// connection
		
	
		
		
	}


	public R call() throws Exception {
		
		//call the endpoint 
		
		//Statement exec
		
		
		
		return null;
	}

}
