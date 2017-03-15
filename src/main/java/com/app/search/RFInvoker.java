package com.app.search;

public class RFInvoker<T> implements AppraiserInvoker<T> {

	
	private Object requestObj = null;

	public RFInvoker(final Object requestObj) {
		this.requestObj = requestObj;
	}

	
	public boolean isValidRequest() throws InvalidInputException {
		return true;
	}

	public void init() throws InitializationFailedException {
		
		
		
		
		
		return ;
	}


	public T call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
