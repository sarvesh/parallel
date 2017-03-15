package com.app.search;

public class AppraiserFactory<R> {

	public AppraiserInvoker<R> getAppraiserType(String appraiserType, Object requestObj) {

		AppraiserInvoker<R> appInvoker = null;

		if (appraiserType.equals("RF")) {
			appInvoker = new StaffInvoker<R>(requestObj);
		} else if (appraiserType.equals("RF")) {
			appInvoker = new RFInvoker<R>(requestObj);
		}

		return appInvoker;

	}

	
	/*public void test(){

		AppraiserFactory<R> af = new AppraiserFactory<R>();
		
		AppraiserInvoker<R> appInvoker = af.getAppraiserType("RF", new Object());
		
		System.out.println("Printing appInvoker Type :: "+appInvoker.getClass() + " -- "+appInvoker);
		
		
	}
	
	
	
	
	public static void main(String args[]){
		
		AppraiserFactory af = new AppraiserFactory();
		
		af.test();
		
	
		AppraiserFactory af2 = new AppraiserFactory();
		
		af2.test();

		
		
	}*/
	
	
}
