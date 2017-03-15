package com.app.search;

import java.util.concurrent.Callable;

public interface AppraiserInvoker<R> extends Callable<R> {

	public boolean isValidRequest() throws InvalidInputException;
	
	public void init() throws InitializationFailedException;
	

	
}